package kam.jar.radek.hibernate.com;

import java.util.ArrayList;

import kam.jar.radek.hibernate.com.dao.UserDao;
import kam.jar.radek.hibernate.com.model.User;

public class Launcher {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		UserDao dao = new UserDao();
		users.add(new User(5, "First", "First", "empty", "2574567"));
		users.add(new User(6, "Second", "Second", "empty", "7654234"));
		users.add(new User(7, "Third", "Third", "empty", "543272"));
		users.add(new User(8, "Fourth", "Fourth", "empty", "48765"));

		for (User u : users) {
			dao.create(u);
		}
		dao.closeEntityMenager();
	}
}
