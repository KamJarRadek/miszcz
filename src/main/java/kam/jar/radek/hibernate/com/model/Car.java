package kam.jar.radek.hibernate.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_CAR")
public class Car {
	@Id
	@Column(name = "car_id")
	private int carId;
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "YEAR")
	private int year;
	@Column(name = "COLOR")
	private String color;
	@JoinColumn(name =  "USER_ID", insertable= false, updatable=false)
	@ManyToOne
	private User u;
	public Car() {
	}
	public Car(int carId,int userId , String model, int year, String color) {
		super();
		this.carId = carId;
		this.userId = userId;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	protected int getCarId() {
		return carId;
	}
	protected void setCarId(int carId) {
		this.carId = carId;
	}
	protected int getUserId() {
		return userId;
	}
	protected void setUserId(int userId) {
		this.userId = userId;
	}
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", userId=" + userId + ", model=" + model + ", year=" + year + ", color=" + color
				+ "]";
	}
	
}
