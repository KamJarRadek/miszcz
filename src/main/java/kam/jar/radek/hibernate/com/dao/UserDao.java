package kam.jar.radek.hibernate.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import kam.jar.radek.hibernate.com.model.User;

public class UserDao implements CRUD<User>{
	
	
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public void create(User u) {
		 entityManager = entityManagerFactory.createEntityManager();
		 System.out.println(entityManager);
		    entityManager.getTransaction().begin();
		    entityManager.persist(u);
		    entityManager.getTransaction().commit();

	}

	public User read(User u) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.persist(u);
	    entityManager.getTransaction().commit();

		return null;
	}

	public void update(User u) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.merge(u);
	    entityManager.getTransaction().commit();
		
	}

	public void delete(User u) {
		entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.remove(u);
	    entityManager.getTransaction().commit();
		
	}
	
	
   
	
	
}
