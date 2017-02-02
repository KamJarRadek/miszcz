package kam.jar.radek.hibernate.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_secondteble")
public class User {
	@Id
	@Column (name = "id")
	private int userId;
	private String name;
	private String surname;
	private String address;
	private String phone;
	
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
