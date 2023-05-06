package com.masai.UiDAO;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import DAO.AdminDAO;
import DAO.AdminDAOimp;
import EntityDAO.Admin;
import EntityDAO.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static void adimnInterface(Scanner sc) {
		 
		char choice = '0';
	        do {
	        	System.out.println();
	        	System.out.println("1. View all Products");
	        	System.out.println("2. update Product by ID");
	        	System.out.println("2. Delete a Product by its ID");
	        	System.out.println("3. View Customer Details");
	        	System.out.println("4. Update Customer Details by ID");
	        	System.out.println("5. Delete Customer Details by ID");
	        	System.out.println("0. Exit");
	        	System.out.println();
	        	System.out.print("Enter your choice: ");
	        	choice = sc.next().charAt(0);
	        	
	        	switch(choice)
	        	{
	        		case '1':
	        			
	        			break;
	        		case '2':
	        			break;
	        		case '3':
	        			
	        			break;
	        		case '4':
	        			break;
	        		case '5':
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
