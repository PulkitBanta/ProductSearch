package projects.cont;

//import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.Dao.Product;
import projects.service.ProductService;

@RestController
public class contr1 {
	@Autowired
	private ProductService ProductService;
	
	@RequestMapping("/")
	public String hello() {
		return "Working from Spring Boot";
	}
	
	  
	@RequestMapping("/allProducts")
	public List<Product> getProducts() { 
		return ProductService.getAllProducts();
	}
	 
}
