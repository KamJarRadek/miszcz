package kam.jar.radek.hibernate.com.dao;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import kam.jar.radek.hibernate.com.Job;
import kam.jar.radek.hibernate.com.model.User;

public class UserDao<T> implements CRUD<T> {
	//@repository

	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public void create(T t) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
		entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		entityManager.merge(t);
		entityManager.getTransaction().commit();

	}

	public void closeEntityMenager() {
		entityManager.close();
	}

	public User read(int id) {
		entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(User.class, id);
		
	}

	public void update(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		User read = read(id);
		entityManager.merge(read);
		entityManager.getTransaction().commit();

	}

	public void delete(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		User read = read(id);
		entityManager.remove(read);
		entityManager.getTransaction().commit();

	}


}
