package kam.jar.radek.hibernate.com;

import java.util.ArrayList;
import java.util.Date;
import kam.jar.radek.hibernate.com.dao.UserDao;
import kam.jar.radek.hibernate.com.model.Car;
import kam.jar.radek.hibernate.com.model.User;

public class Launcher {

	public static <T> void main(String[] args) {
		UserDao dao = new UserDao();
		User user = new User(17, "Fourth", "Fourth", "empty", "48765");
		
		 ArrayList<User> users = new ArrayList<User>();
		 users.add(new User(5, "First", "First", "empty", "2574567"));
		 users.add(new User(6, "Second", "Second", "empty", "7654234"));
		 users.add(new User(7, "Third", "Third", "empty", "543272"));
		 users.add(new User(8, "Fourth", "Fourth", "empty", "48765"));
		
		 for (User u : users) {
		 dao.create(u);
		 }

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1, 1, "model1", 2000, "red"));
		cars.add(new Car(2, 1, "model2", 2001, "red"));
		cars.add(new Car(3, 1, "model3", 2002, "red"));
		cars.add(new Car(4, 1, "model4", 2003, "red"));
		cars.add(new Car(5, 1, "model5", 2004, "red"));
		cars.add(new Car(6, 1, "model1", 2005, "red"));

		for (Car car : cars) {
			user.getCars().add(car);
		}

		ArrayList<Job> jobs = new ArrayList<Job>();
		jobs.add(new Job(1, new Date(), "desc1"));
		jobs.add(new Job(2, new Date(), "desc2"));
		jobs.add(new Job(3, new Date(), "desc3"));
		jobs.add(new Job(4, new Date(), "desc4"));
		jobs.add(new Job(5, new Date(), "desc5"));

		for (Job job : jobs) {
			user.getJobs().add(job);
		}
		dao.create(user);

		 dao.closeEntityMenager();
	}

}
