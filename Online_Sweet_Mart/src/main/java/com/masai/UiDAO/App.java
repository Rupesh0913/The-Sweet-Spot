package com.masai.UiDAO;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import DAO.AdminDAO;
import DAO.AdminDAOimp;
import EntityDAO.Admin;
import EntityDAO.Customer;
import Exception.SomeThingWentWrongException;
import ServiceDAO.AdminService;
import ServiceDAO.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
	static void customerInterface(Scanner sc) {
		char choice = '0';
        do {
        	System.out.println();
        	System.out.println("1. View all Products");
        	System.out.println("2. View cart");
        	System.out.println("0. Exit");
        	System.out.println();
        	System.out.print("Enter your choice: ");
        	choice = sc.next().charAt(0);
        	CustomerService cusSev = new CustomerService(); 
        	
        	switch(choice)
        	{
        		case '1':
        			cusSev.allProducts();
        			break;
        		case '2':
//        			cusSev.showCart();
        			break;
        		case '0':
        			System.out.println("Thanks for visiting");
        			break;
        		default:
        			System.out.println("Invalid Input");
        	}
        	
        }while(choice!='0');
	}
	
	static void adimnInterface(Scanner sc) {
		 
		char choice = '0';
	        do {
	        	System.out.println();
	        	System.out.println("1. Add a new category");
	        	System.out.println("2. view all category");
	        	System.out.println("3. Add a new Products");
	        	System.out.println("4. View all Products");
	        	System.out.println("5. update Product by ID");
	        	System.out.println("6. Delete a Product by its ID");
	        	System.out.println("7. View Customer Details");
	        	System.out.println("0. Exit");
	        	System.out.println();
	        	System.out.print("Enter your choice: ");
	        	choice = sc.next().charAt(0);
	        	AdminService adminserv = new AdminService();
	        	
	        	switch(choice)
	        	{
	        		case '1':
	        			adminserv.addCategory(sc);
	        			break;
	        		case '2':
	        			adminserv.viewCategory();
	        			break;
	        		case '3':
	        			adminserv.addProduct(sc);
	        			break;
	        		case '4':
	        			adminserv.printAllProducts();
	        			break;
	        		case '5':
	        			adminserv.updateProducts(sc);
	        		case '6':
	        			adminserv.deleteProducts(sc);
	        		case '7':
	        			adminserv.viewAllCustomers();
	        			break;
	        		case '0':
	        			System.out.println("Thanks for visiting");
	        			break;
	        		default:
	        			System.out.println("Invalid Input");
	        	}
	        	
	        }while(choice!='0');
	}
	
	static void adminLogin(Scanner sc)
	{
		System.out.print("Eter admin USerName: ");
		String admin = sc.next();
		System.out.print("Enter admin Password: ");
		String pass = sc.next();
		Set<Customer> cusSet = new HashSet<>();
		
		
		Admin add = new Admin();
		if(admin.equals(add.getUsername()) && pass.equals(add.getPassword()))
		{
			adimnInterface(sc);
		}
		else {
			System.out.println("Wrong Credentials");
			System.exit(1);
		}
	}
	
	static void UserSignUp(Scanner sc)
	{
		System.out.print("Create Your User Name: ");
		String username = sc.next();
		System.out.print("Create Your password: ");
		String pass = sc.next();
		
		
		
//		Admin add =new Admin();
//		Set <Customer> cusSet = new HashSet();
//		
//		
//		Customer cus = new Customer(username, pass, add);
//		
//		cusSet.add(cus);
//		add.setSetCust(cusSet);
//		
//		
		AdminDAO adminDAO = new AdminDAOimp();
		
			adminDAO.addCustomerToAdmin(username,pass );
		
	}
	
	static void UserLogin(Scanner sc)
	{
		System.out.print("Create Your User Name: ");
		String username = sc.next();
		System.out.print("Create Your password: ");
		String pass = sc.next();
		CustomerService cusServ = new CustomerService();
		if(cusServ.checkCustomer(username,pass)) {
			customerInterface(sc);
		}
		else
		{
			System.out.println("Invalid credentials");
		}
		
	}
	
	
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        char choice = '0';
        do {
        	System.out.println();
        	System.out.println("1. Admin Login");
        	System.out.println("2. User Login");
        	System.out.println("3. User SignUp");
        	System.out.println("0. Exit");
        	System.out.println();
        	System.out.print("Enter your choice: ");
        	choice = sc.next().charAt(0);
        	
        	switch(choice)
        	{
        		case '1':
        			adminLogin(sc);
        			break;
        		case '2':
        			UserLogin(sc);
        			break;
        		case '3':
        			UserSignUp(sc);
        			break;
        		case '0':
        			System.out.println("Thanks for visiting");
        			break;
        		default:
        			System.out.println("Invalid Input");
        	}
        	
        }while(choice!='0');
    }
}
