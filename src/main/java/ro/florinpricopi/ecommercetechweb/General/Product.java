package ro.florinpricopi.ecommercetechweb.General;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
	
	public enum Colors {
		Black,
		Blue,
		Pink,
		Green,
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String name;
	protected double price;
	protected int quantity;
	protected Colors colors;
	
	public Product(String name, double price, int quantity, Colors colors) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.colors = colors;
	}

	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Colors getColors() {
		return colors;
	}

	public void setColor(Colors colors) {
		this.colors = colors;
	}
	
	@Override
	public String toString() {
		String returnString = "Id: " + id + "Name: " + name + ", Price: " + price + ", Quantity: " + ", Color: " + colors;
		return returnString;
	}
	


}
