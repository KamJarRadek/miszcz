package kam.jar.radek.hibernate.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import kam.jar.radek.hibernate.com.model.User;

public class UserDao implements CRUD<User>{
	
	
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public void create(int id) {
		 entityManager = entityManagerFactory.createEntityManager();
		 Persistence
         .createEntityManagerFactory("jpa-example");
		 System.out.println(entityManager);
		    entityManager.getTransaction().begin();
		    entityManager.persist();
		    entityManager.getTransaction().commit();

	}

	public User read(int id) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.persist(u);
	    entityManager.getTransaction().commit();

		return null;
	}

	public void update(int id) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.merge(u);
	    entityManager.getTransaction().commit();
		
	}

	public void delete(int id) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.remove(u);
	    entityManager.getTransaction().commit();
		
	}
	
	
   
	
	
}
