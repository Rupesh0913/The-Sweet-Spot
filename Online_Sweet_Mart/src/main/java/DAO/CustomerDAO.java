package DAO;



import EntityDAO.Customer;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;

public interface CustomerDAO {
	public Customer getAllCustomers(String UserName,String pass);
//	public void addProductToCart(int id)throws NoRecordFoundException;
//	public void viewCart()throws SomeThingWentWrongException;
}
