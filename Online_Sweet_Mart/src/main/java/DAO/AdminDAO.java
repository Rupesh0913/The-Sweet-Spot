package DAO;

import EntityDAO.Category;

public interface AdminDAO {
	public void addCustomerToAdmin(String username, String pass);
	public void addCategory(Category catog);
	public void ViewAllCategory(Category catog);
}
