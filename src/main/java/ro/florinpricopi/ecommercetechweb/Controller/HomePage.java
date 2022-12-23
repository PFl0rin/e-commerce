package ro.florinpricopi.ecommercetechweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/user") 
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin") 
	public String admin() {
		return "admin";
	}
	
}
