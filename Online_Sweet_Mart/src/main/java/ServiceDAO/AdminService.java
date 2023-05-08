package ServiceDAO;

import java.util.Scanner;

import DAO.AdminDAO;
import DAO.AdminDAOimp;
import EntityDAO.Category;
import EntityDAO.Customer;
import EntityDAO.Products;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;
//import EntityDAO.Category;


public class AdminService {
	
	public static void addProduct(Scanner sc) {
		System.out.print("Enter product name: ");
		String name = sc.next();
		System.out.print("Enter product price: ");
		int price = sc.nextInt();
		System.out.print("Enter product Desc: ");
		String desc= sc.next();
		viewCategory();
		System.out.print("Give ID to yor Product:");
		int id = sc.nextInt();
		
		AdminDAO adminDAO = new AdminDAOimp();
		try {
			Category cat = adminDAO.getcategoryById(id);
			adminDAO.addProduct(name,price,desc,cat);
			System.out.println("New Prduct added");
		} catch (SomeThingWentWrongException | NoRecordFoundException e) {
			
			System.out.println( e.getMessage());
		}
	}
	public static void printAllProducts()
	{
		Products prod = new Products();
		AdminDAO adminDAO = new AdminDAOimp();
		try {
			adminDAO.printAllProducts();
		} catch (SomeThingWentWrongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void updateProducts(Scanner sc) {
		System.out.print("Enter Product ID: ");
		int id= sc.nextInt();
		AdminDAO adminDAO = new AdminDAOimp();
		try {
			adminDAO.updateProductsById(id);
			System.out.println("Prduct Updated Succesfuly");
		} catch (NoRecordFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteProducts(Scanner sc) {
		System.out.print("Enter Product ID: ");
		int id= sc.nextInt();
		AdminDAO adminDAO = new AdminDAOimp();
		try {
			adminDAO.deleteProductsById(id);
			System.out.println("Prduct Deleted Succesfuly");
		} catch (NoRecordFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void addCategory(Scanner sc) {
		System.out.print("Enter Category Name: ");
		String category = sc.next();
		
		Category catog = new Category();
		catog.setName(category);
		
		AdminDAO adminDAO = new AdminDAOimp();
		adminDAO.addCategory(catog);
	}
	
	
	
	public static void viewCategory() {
		Category catog = new Category();
		AdminDAO adminDAO = new AdminDAOimp();
		adminDAO.ViewAllCategory(catog);
	}
	
	public static void viewAllCustomers() {
		Customer cust = new Customer();
		AdminDAO adminDAO = new AdminDAOimp();
		try {
			adminDAO.ViewAllCustomers(cust);
		} catch (SomeThingWentWrongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
