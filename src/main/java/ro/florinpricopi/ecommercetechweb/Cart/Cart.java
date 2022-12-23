package ro.florinpricopi.ecommercetechweb.Cart;
import java.util.ArrayList;
import ro.florinpricopi.ecommercetechweb.General.Product;

public class Cart {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	private double totalCartValue;
	
	public Cart() {};
	
	public Cart(ArrayList<Product> products, double totalCartValue) {
		this.products = products;
		this.totalCartValue = totalCartValue;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public double getTotalCartValue() {
		return totalCartValue;
	}

	public void setTotalCartValue(double totalCartValue) {
		this.totalCartValue = totalCartValue;
	}
	
	@Override
	public String toString() {
		String returnString = "Products: " + products + ", Total value: " + totalCartValue;
		return returnString;
	}
	
	

}
