package kam.jar.radek.hibernate.com.dao;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import kam.jar.radek.hibernate.com.Job;
import kam.jar.radek.hibernate.com.model.User;

public class UserDao<T> implements CRUD<T> {

	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public void create(T t) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
		entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		//-------------------------------------------
		User user = new User(15, "Fourth", "Fourth", "empty", "48765");
		ArrayList<Job> jobs = new ArrayList<Job>();
		jobs.add(new Job(1, new Date(), "desc1"));
		jobs.add(new Job(2, new Date(), "desc2"));
		jobs.add(new Job(3, new Date(), "desc3"));
		jobs.add(new Job(4, new Date(), "desc4"));
		jobs.add(new Job(5, new Date(), "desc5"));

		for (Job job : jobs) {
			user.getJobs().add(job);
		}
			
		
		
		
//		---------------------------------
		entityManager.persist(user);
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
