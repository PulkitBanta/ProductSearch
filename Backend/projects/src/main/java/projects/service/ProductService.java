package projects.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import projects.Dao.Product;

@Service
public class ProductService {
	
	private List<Product> products = new ArrayList<Product> (Arrays.asList(
			
			new Product("https://images.unsplash.com/photo-1563297007-0686b7003af7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1091&q=80", "Logitech G304 Mouse", "Gaming Mouse with best sensor for competitive gaming", 82),
			new Product("https://images.unsplash.com/photo-1547394765-185e1e68f34e?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", "Redragon Mechanincal Keyboard", "Best Mechanical Keyboard with Cherry MX Red switches", 143),
			new Product("https://images.unsplash.com/photo-1551645120-d70bfe84c826?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80", "Asus HDR Monitor", "HDR monitor for pixel accuracy, 100% RGB accuracy", 289),
			new Product("https://images.unsplash.com/photo-1551642044-b5e65d8a7fac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1489&q=80", "AMD Ryzen 3900x", "Great processor with 16 cores, 32 threads.", 435),
			new Product("https://images-na.ssl-images-amazon.com/images/I/71NJEd2NO%2BL._SL1000_.jpg", "MSI B450 Tomahawk Motherboard", "Best budget friendly gaming motherboard, out of the box zen 3 support", 50),
			new Product("https://cwsmgmt.corsair.com/media/hybris/tlc/mousepads/TLC_mousepads_banner.jpg", "Corsair MM800 Mousepad", "Corsair mousepad with RGB, best for precision aiming", 40),
			new Product("https://www.computeruniverse.net/images/1000/907099826E2E31ED9D654B27B23DE455.jpg", "Corsair LL140 RGB Fans", "140mm Fans which will keep your system cool", 55),
			new Product("https://images-na.ssl-images-amazon.com/images/I/7149ZGA38mL._SL1500_.jpg", "IKEA MICKE Workstation Desk", "The best workstation table made with high quality wood", 210),
			new Product("https://microless.com/cdn/products/0aa7a05f166306e967f35c791b9b0e95-hi.jpg", "Corsair Vengeance RGB", "16 gb RAM kit, with some RGB", 78),
			new Product("https://images-na.ssl-images-amazon.com/images/I/81ZWWtwWf6L._SL1500_.jpg", "Samsung 970 EVO Plus", "Fastest storage device availabe in the market", 120),
			new Product("https://i0.wp.com/content.crucial.com/content/dam/crucial/ssd-products/bx500/images/in-use/crucial-bx500-inuse-image-1.psd.transform/small-png/image.jpg?ssl=1", "Crucial BX500 250Gb", "Install your Operating System and some light weight games for fast run", 30),
			new Product("https://images.tweaktown.com/content/3/6/3633_01.jpg", "Corsair GS800 800W Power Supply", "80+ platinum rated Power Supply best for your tower", 220),
			new Product("https://www.moddiy.com/product_images/u/587/IMG_8806s__19228_zoom.JPG", "Corsair Modular Sleeve", "Make your system look modern wiht these cables", 40),
			new Product("https://sta3-nzxtcorporation.netdna-ssl.com/uploads/product_image/image/1779/large_bf09d83f5909eb72.jpg", "H500 NZXT", "For a beast gaming pc you will also need a beast gaming tower", 96),
			new Product("https://www.incredible.co.za/media/catalog/product/cache/3/image/1400x/0dc2d03fe217f8c83829496872af24a0/m/a/masterliquid_ml120r.png", "Cooler Master Liquid CPU Cooler", "CPU cooler with inbuilt customizable LED", 114)
			
			));
			
			public List<Product> findProduct(int start, int end) {
				List<Product> res = new ArrayList<Product>();
				end = start*end + 4;
				start = start * 4;
				
				if(end > products.size())
					end = products.size();
					
				res = products.subList(start, end);
				
				return res;
			}
			
			public int totalSize() {
				return products.size();
			}
			
			public List<Product> searchResult(String query, int offset, int limit) {
				List<Product> res = new ArrayList<Product>();
				
				if(query.equals(""))
					return products;
				
				for(int i = offset; i < products.size(); i++) {
					if((products.get(i).getDescription().trim().toLowerCase().contains(query) || products.get(i).getName().toLowerCase().trim().contains(query) || String.valueOf(products.get(i).getPrice()).contains(query)) && res.size() < limit)
							res.add(products.get(i));
				}
				
				return res;
			}

}
