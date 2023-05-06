package DAO;

import EntityDAO.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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

}
