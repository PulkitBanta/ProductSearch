package projects.cont;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projects.Dao.Product;
import projects.service.ProductService;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
public class contr1 {
	@Autowired
	private ProductService ProductService;
	
	@RequestMapping("/")
	public String hello() {
		return "Working from Spring Boot";
	}
	
	@GetMapping("/products/list")
	@PostMapping("/?page")
	public List<Product> getProducts(@RequestParam(defaultValue="0") int page) { 
		return ProductService.findProduct(page, 4);
	}
	
	@RequestMapping("/products/size")
	public int total() {
		return ProductService.totalSize();
	}
	
	@GetMapping("/products/list/search")
	public List<Product> search(@RequestParam(defaultValue="0") String query, int offset, int limit) { 
		return ProductService.searchResult(query, offset, limit);
	}
	 
}
