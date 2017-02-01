package kam.jar.radek.hibernate.com.dao;

public interface CRUD<T> {
	
	public void create(int id);
	public T read(int id);
	public void update(int id);
	public void delete(int id);
}
