package kam.jar.radek.hibernate.com.dao;

import kam.jar.radek.hibernate.com.model.User;

public interface CRUD<T> {
	
	public void create(T t);
	public User read(int id);
	public void update(int id);
	public void delete(int id);
}
