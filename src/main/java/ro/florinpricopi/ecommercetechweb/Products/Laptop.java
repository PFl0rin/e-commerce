package ro.florinpricopi.ecommercetechweb.Products;
import javax.persistence.Entity;
import javax.persistence.Table;
import ro.florinpricopi.ecommercetechweb.General.Product;

@Entity
@Table(name="Laptop")
public class Laptop extends Product{
	
	public Laptop() {
		super();
	}
	
	public enum Ram {
		GB4,
		GB8,
		GB16,
	}
	
	private Ram ram;
	
	public Laptop(String name, double price, int quantity, Colors colors) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.colors = colors;
		// this.ram = ram;
		
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
	
}
