package kam.jar.radek.hibernate.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import kam.jar.radek.hibernate.com.dao.UserDao;
import kam.jar.radek.hibernate.com.model.Car;
import kam.jar.radek.hibernate.com.model.User;


public class Launcher {

	public static <T> void main(String[] args) {
		UserDao dao = new UserDao();
		dao.create(new Object());
//		ArrayList<User> users = new ArrayList<User>();
//		users.add(new User(5, "First", "First", "empty", "2574567"));
//		users.add(new User(6, "Second", "Second", "empty", "7654234"));
//		users.add(new User(7, "Third", "Third", "empty", "543272"));
//		users.add(new User(8, "Fourth", "Fourth", "empty", "48765"));
//
//		for (User u : users) {
//			dao.create(u);
//		}
//		dao.closeEntityMenager();
		

	
//	ArrayList<Car> cars = new ArrayList<Car>();
//	cars.add(new Car(1, 1, "model1", 2000, "red"));
//	cars.add(new Car(2, 1, "model2", 2001, "red"));
//	cars.add(new Car(3, 1, "model3", 2002, "red"));
//	cars.add(new Car(4, 1, "model4", 2003, "red"));
//	cars.add(new Car(5, 1, "model5", 2004, "red"));
//	cars.add(new Car(1, 1, "model1", 2005, "red"));
//	
//	for (Car car : cars) {
//		user.getCars().add(car);
//	}


//    File file = new File("objektDoXMl.txt");
//
//
//    JAXBContext jaxbContext;
//    T entity = null;
//	try {
//		jaxbContext = JAXBContext.newInstance(User.class);
//		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//		  Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//          entity = (T) jaxbUnmarshaller.unmarshal(file);
//          System.out.println(entity);
//	} catch (JAXBException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}



	}
	
}
