package ServiceDAO;

import java.util.Scanner;

import DAO.AdminDAO;
import DAO.AdminDAOimp;
import EntityDAO.Category;

public class AdminService {
	public static void addProduct(Scanner sc) {
		System.out.print("Enter product name: ");
		String name = sc.next();
		System.out.print("Enter product price: ");
		int price = sc.nextInt();
		System.out.print("Enter product Desc: ");
		String desc= sc.next();
		
		System.out.println("Choose Category");
		viewCategory();
		System.out.println("Enter Category ID: ");
		int catId = sc.nextInt();
		
		
//		chooseCategory();
//		addCategory(sc);
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
}
