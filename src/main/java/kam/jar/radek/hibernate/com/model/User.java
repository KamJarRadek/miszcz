package kam.jar.radek.hibernate.com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.engine.internal.Cascade;

import kam.jar.radek.hibernate.com.Job;


@Entity
@Table(name = "user_secondteble")
public class User {
	@Id
	@Column (name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column (name = "USER_NAME")
	private String name;
	@Column (name = "SURNAME")
	private String surname;
	@Column (name = "ADDRESS")
	private String address;
	@Column(name = "PHONE_NO")
	private String phone;
	@OneToMany(mappedBy = "u", cascade = CascadeType.ALL)
	private List<Car> cars = new ArrayList<Car>();
	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	@OneToMany(mappedBy = "us", cascade = CascadeType.ALL)
	private List<Job> jobs = new ArrayList<Job>();
	
	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public User() {
	}

	public User(int userId, String name, String surname, String address, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", surname=" + surname + ", address=" + address + ", phone="
				+ phone + "]";
	}
	
}
