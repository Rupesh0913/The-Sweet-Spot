package ServiceDAO;

import java.util.List;

import DAO.CustomerDAO;
import DAO.CustomerDAOimp;
import EntityDAO.Customer;

public class CustomerService {
	public static void checkCustomer(String UserName,String pass)
	{
//		Customer cus = new Customer();
		CustomerDAO cusDAO = new CustomerDAOimp();
		Object cus =cusDAO.getAllCustomers(UserName,pass);
//		cusList.forEach(System.out::println);
		
//		if(cusList.contains(UserName))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
		
	}
}
