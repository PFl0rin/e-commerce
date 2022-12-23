package ro.florinpricopi.ecommercetechweb.Service;

import org.springframework.stereotype.Service;
import ro.florinpricopi.ecommercetechweb.General.Product;
import ro.florinpricopi.ecommercetechweb.Repository.ProductRepository;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllTshirts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public Product getProduct(Long id) {
		return productRepository.findById(id).get();
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Long id, Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
