package DAO;



//import EntityDAO.Category;
import EntityDAO.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class CustomerDAOimp implements CustomerDAO {

	@Override
	public Object getAllCustomers(String UserName,String pass) {
		EntityManager em = EMUtil.getEntityManager();
		String AllCustomerQuery = "SELECT c FROM Customer c";
		Query query = em.createQuery(AllCustomerQuery);
		Object customer = query.getFirstResult();
//		categoryList.forEach(System.out::println);
		em.close();
		return customer;

	}

}
