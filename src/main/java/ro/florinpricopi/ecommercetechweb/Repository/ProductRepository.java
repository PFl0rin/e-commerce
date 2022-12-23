package ro.florinpricopi.ecommercetechweb.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.florinpricopi.ecommercetechweb.General.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
