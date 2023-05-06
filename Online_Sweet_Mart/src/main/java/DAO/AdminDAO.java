package DAO;

import EntityDAO.Admin;
import EntityDAO.Customer;

public interface AdminDAO {
	public void addCustomerToAdmin(String username, String pass);
}
