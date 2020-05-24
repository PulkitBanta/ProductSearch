package projects;

import org.springframework.boot.SpringApplication;
import org.json.simple.parser.*;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import projects.Dao.Product;
import projects.service.ProductService;


@SpringBootApplication
public class MainApp implements CommandLineRunner {
	public static void main(String[] args) {
		
		SpringApplication.run(MainApp.class, args);
		
	}
	
	Product customer = new Product();

	// reading and adding data to the productService
	@SuppressWarnings("unchecked")
	public void run(String... args) throws Exception {
		File file = new File("src/main/resources/json/data.json");
		String absolutePath = file.getAbsolutePath();
		List<Product> data = (List<Product>) new JSONParser().parse(new FileReader(absolutePath)); 
		
		ProductService.addProducts(data);
	}
}
