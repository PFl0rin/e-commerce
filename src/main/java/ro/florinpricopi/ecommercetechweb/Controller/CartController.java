package ro.florinpricopi.ecommercetechweb.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import ro.florinpricopi.ecommercetechweb.General.Product;
//import ro.florinpricopi.ecommercetechweb.Cart.Cart;
import ro.florinpricopi.ecommercetechweb.Service.CartService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CartController {
	
	private CartService cartService;
	private CartService carts = new CartService();
	
	@GetMapping("/cart")
	public String showAllProducts(Model model) {
		ArrayList<Product> products = carts.getProducts();
		model.addAttribute("cart", products);
		return "cart";
		
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	

}
