package DAO;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import EntityDAO.Category;
//import EntityDAO.Category;
import EntityDAO.Customer;
import EntityDAO.Products;
import Exception.NoRecordFoundException;
import Exception.SomeThingWentWrongException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
//import jakarta.persistence.Query;
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
	public void addProduct(String name,int price, String desc,Category cat) throws SomeThingWentWrongException{
		
		Products prod  =new Products(name,price,desc,cat);
		Category catog =new Category();
		Set<Products> prodSet = new HashSet<>();
		prodSet.add(prod);
		catog.setProdSet(prodSet);
		EntityManager em = EMUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(prod);
			em.persist(catog);
			et.commit();
		}catch(PersistenceException e)
		{
			throw new SomeThingWentWrongException("Validation Problem");
		}finally {
			em.close();
		}
	}
	
	@Override
	public  void printAllProducts() throws SomeThingWentWrongException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.getEntityManager();
		try {
			String AllProductsQuery = "SELECT p FROM Products p";
			Query query = em.createQuery(AllProductsQuery);
			List<Products> productList = query.getResultList();
			productList.forEach(System.out::println);
		}catch(Exception e)
		{
			throw new SomeThingWentWrongException("Problem in Printing");	
		}
		finally {
			em.close();			
		}
		
	}
	
	@Override
	public void updateProductsById(int id) throws NoRecordFoundException {
		Scanner sc =new Scanner(System.in);
		EntityManager em = EMUtil.getEntityManager();
		Products prod=null;
		try {
			 prod = em.find(Products.class, id);
			 if(prod == null)
				 throw new NoRecordFoundException("Empty Data");
			 
			System.out.print("Give New Name: ");
			String name = sc.next(); 
			System.out.print("Give New Price: ");
			int price = sc.nextInt();
			System.out.print("Give New Description: ");
			String descr = sc.next();
			

			prod.setName(name);
			prod.setPrice(price);
			prod.setDesc(descr);
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(prod);
			et.commit();
			
		}catch(Exception e)
		{
			throw new NoRecordFoundException("Someting Went Wrong");	
		}
		finally {
			em.close();			
		}
		
	}
	

	@Override
	public void deleteProductsById(int id) throws NoRecordFoundException {
		Scanner sc =new Scanner(System.in);
		EntityManager em = EMUtil.getEntityManager();
		Products prod=null;
		try {
			 prod = em.find(Products.class, id);
			 if(prod == null)
				 throw new NoRecordFoundException("Empty Data");
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.remove(prod);
			et.commit();
			
		}catch(Exception e)
		{
			throw new NoRecordFoundException("Someting Went Wrong");	
		}
		finally {
			em.close();			
		}
		
		
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

	@Override
	public Category getcategoryById(int id) throws NoRecordFoundException {
		EntityManager em = EMUtil.getEntityManager();
		String getCategoryQuery = "SELECT c FROM Category c WHERE c.id = :id";
		Query query = em.createQuery(getCategoryQuery);
		query.setParameter("id", id);
		Category cat =(Category)query.getSingleResult();
		if(cat == null)
			throw new NoRecordFoundException("Id Not Present");
		else 
			return cat;
			
	}

	@Override
	public void ViewAllCustomers(Customer cust) throws SomeThingWentWrongException {
		EntityManager em = EMUtil.getEntityManager();

			String AllCustomerQuery = "SELECT c FROM Customer c";
			Query query = em.createQuery(AllCustomerQuery);
			List<Customer> customerList = query.getResultList();
			if(customerList==null)
				throw new SomeThingWentWrongException("No Data Found");
			customerList.forEach(System.out::println);
			em.close();
			
	}

		
		

}
