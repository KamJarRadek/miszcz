package kam.jar.radek.hibernate.com.dao;

import kam.jar.radek.hibernate.com.model.User;

public interface CRUD<T> {
	
	public void create(User u);
	public T read(User u);
	public void update(User u);
	public void delete(User u);
}
