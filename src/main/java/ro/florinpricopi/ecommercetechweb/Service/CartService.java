package ro.florinpricopi.ecommercetechweb.Service;
import java.util.ArrayList;

import ro.florinpricopi.ecommercetechweb.Products.Laptop;
import ro.florinpricopi.ecommercetechweb.General.Product;
import ro.florinpricopi.ecommercetechweb.General.Product.Colors;
 

public class CartService {
	
	private ArrayList<Product> products = new ArrayList<>();
	
	public CartService() {
		addProducts();
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public void setProduct(ArrayList<Product> product) {
		products.addAll(product);	
	}
	
	public void addProducts() {
		
		//Product pr1 = new Phone(1, "Happy Happy Joy Joy", 89.45, 8, Size.XL, "Pink", Gender.FEMALE);
		//Product pr2 = new Phone(2, "Gradient", 100, 4, Size.S, "Orange", Gender.MALE);
		Product pr3 = new Laptop("Asus", 1500.00, 42, Colors.Black);
		Product pr4 = new Laptop("Lenovo", 2200.00, 37, Colors.Blue);
		//Product pr5 = new Tablet("Samsung", 5999.99, 15, Color.black);

		//products.add(pr1);
		//products.add(pr2);
		products.add(pr3);
		products.add(pr4);
		//products.add(pr5);
	}

}
