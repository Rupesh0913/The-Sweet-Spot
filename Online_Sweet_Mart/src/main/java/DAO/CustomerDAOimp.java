package DAO;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import EntityDAO.Cart;
//import EntityDAO.Category;
import EntityDAO.Customer;
import EntityDAO.Products;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class CustomerDAOimp implements CustomerDAO {

	@Override
	public Customer getAllCustomers(String UserName,String pass) {
		EntityManager em = EMUtil.getEntityManager();
		String AllCustomerQuery = "SELECT c FROM Customer c WHERE username = :UserName AND password= :pass";
		Query query = em.createQuery(AllCustomerQuery);
		query.setParameter("UserName", UserName);
		query.setParameter("pass",pass);
		Customer customer=null;
		customer = (Customer)query.getSingleResult();
		
		em.close();	
		return customer;
	}

//	@Override
//	public void addProductToCart(int id) throws NoRecordFoundException{
//		Scanner sc =new Scanner(System.in);
//		EntityManager em = EMUtil.getEntityManager();
//		Products prod=null;
//	
//			 prod = em.find(Products.class, id);
//			 if(prod == null)
//				 throw new NoRecordFoundException("Empty Data");
//			 
//			 Cart cart = new Cart();
//
//			 List<Products> prodList = new ArrayList();
//			 prodList.add(prod);
//			 cart.setProdList(prodList);
//			 
//			EntityTransaction et = em.getTransaction();
//			et.begin();
//			em.persist(cart);
//			em.persist(prod);
//			et.commit();
//			em.close();
//	}
//
//	@Override
//	public void viewCart() throws SomeThingWentWrongException {
//		EntityManager em = EMUtil.getEntityManager();
//		try {
//			String cartQuery = "SELECT p FROM Products p";
//			Query query = em.createQuery(cartQuery);
//			List<Cart> productList = query.getResultList();
//			productList.forEach(System.out::println);
//		}catch(Exception e)
//		{
//			throw new SomeThingWentWrongException("Problem in Printing");	
//		}
//		finally {
//			em.close();			
//		}
//		
//		
//	}
//	

}
