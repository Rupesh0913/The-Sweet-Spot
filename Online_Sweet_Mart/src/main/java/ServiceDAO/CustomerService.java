package ServiceDAO;



import java.util.Scanner;

import DAO.AdminDAO;
import DAO.AdminDAOimp;
import DAO.CustomerDAO;
import DAO.CustomerDAOimp;
import EntityDAO.Customer;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;

public class CustomerService {
	public static boolean checkCustomer(String UserName,String pass)
	{

		CustomerDAO cusDAO = new CustomerDAOimp();
		Customer cus = cusDAO.getAllCustomers(UserName,pass);
		if(cus==null)
		{
			return false;
		}
		else {
			System.out.println("Logged In Succesfully as "+UserName);
			
			return true;
		}
	}
	
	public static void allProducts() {
		AdminDAO adminDAO = new AdminDAOimp();
		Scanner sc =new Scanner(System.in);
		try {
			adminDAO.printAllProducts();
			System.out.print("Enter Product ID of Product You Want to buy: ");
			int id = sc.nextInt();
			CustomerDAO cusDAO = new CustomerDAOimp();
//			cusDAO.addProductToCart(id);
		} catch (SomeThingWentWrongException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void showCart(){
		CustomerDAO cusDAO = new CustomerDAOimp();
		
	}
//	 double total = prod.getPrice();
//	 String name = prod.getName();	
}
