package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("sweetShopConnect");
	}
	
	static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
