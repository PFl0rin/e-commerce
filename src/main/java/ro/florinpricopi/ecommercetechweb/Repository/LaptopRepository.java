package ro.florinpricopi.ecommercetechweb.Repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;
import ro.florinpricopi.ecommercetechweb.*;

@Repository
public class LaptopRepository extends JpaRepositoryExtension<Laptop, Long> {

}
