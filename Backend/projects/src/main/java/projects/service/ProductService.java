package projects.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import projects.Dao.Product;

@Service
public class ProductService {
	
	private static List<Product> products;
	
	// adding data from json to products
	public static void addProducts(List<Product> data) {
		products = new ArrayList<Product>(data);
	}
			
	// Product list for a particular page
	public List<Product> findProduct(int start, int end) {
		List<Product> res = new ArrayList<Product>();
		end = start*end + 4;
		start = start * 4;
				
		if(end > products.size())
			end = products.size();
					
		res = products.subList(start, end);
				
		return res;
	}
			
	// total size of the list
	public int totalSize() {
		return products.size();
	}
			
	// Search query
	public List<Product> searchResult(String query, int offset, int limit) {
		List<Product> res = new ArrayList<Product>();
				
		if(query.equals(""))
			return products;
				
		for(int i = offset; i < products.size(); i++) {
			if((products.get(i).toString().trim().toLowerCase().contains(query) || products.get(i).getName().toLowerCase().trim().contains(query) || String.valueOf(products.get(i).getPrice()).contains(query)) && res.size() < limit)
					res.add(products.get(i));
		}
				
		return res;
	}

}
