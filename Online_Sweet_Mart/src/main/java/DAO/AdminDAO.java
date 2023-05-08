package DAO;

import EntityDAO.Category;
import EntityDAO.Customer;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;

public interface AdminDAO {
	public void addCustomerToAdmin(String username, String pass);
	public void addProduct(String name,int price, String desc, Category cat)throws SomeThingWentWrongException;
	public void printAllProducts() throws SomeThingWentWrongException;
	public void updateProductsById(int id)throws NoRecordFoundException;
	public void deleteProductsById(int id)throws NoRecordFoundException;
	public void addCategory(Category catog);
	public void ViewAllCategory(Category catog);
	public Category getcategoryById(int id) throws NoRecordFoundException;
	public void ViewAllCustomers(Customer cust)throws SomeThingWentWrongException;;
}
