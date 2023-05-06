package DAO;

import java.util.List;

import EntityDAO.Category;
import EntityDAO.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class AdminDAOimp implements AdminDAO {

	@Override
	public void addCustomerToAdmin( String username, String pass ) {
		Customer cus = new Customer(username, pass);

		EntityManager em = EMUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(cus);
		et.commit();
		em.close();
	}

	@Override
	public void addCategory(Category catog) {
		EntityManager em = EMUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(catog);
		et.commit();
		em.close();
	}

	@Override
	public void ViewAllCategory(Category catog) {
		EntityManager em = EMUtil.getEntityManager();
		String AllCategoryQuery = "SELECT c FROM Category c";
		Query query = em.createQuery(AllCategoryQuery);
		List<Category> categoryList = query.getResultList();
		categoryList.forEach(System.out::println);
		em.close();
	}
	
	

}
