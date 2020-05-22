package projects.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import projects.Dao.Product;

@Service
public class ProductService {
	
	private List<Product> products = new ArrayList<Product> (Arrays.asList(
			
			new Product(1, "https://images.unsplash.com/photo-1563297007-0686b7003af7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1091&q=80", "Logitech G304 Mouse", "A good gaming mouse", 50),
			new Product(2, "https://images.unsplash.com/photo-1547394765-185e1e68f34e?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", "Logitech G304 Mouse", "Redragon Mechanincal Keyboard", 50),
			new Product(3, "https://images.unsplash.com/photo-1551645120-d70bfe84c826?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80", "Asus HDR Monitor", "A good gaming mouse", 50),
			new Product(4, "https://images.unsplash.com/photo-1551642044-b5e65d8a7fac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1489&q=80", "AMD Ryzen 3900x", "A good gaming mouse", 50),
			new Product(5, "https://images-na.ssl-images-amazon.com/images/I/71NJEd2NO%2BL._SL1000_.jpg", "MSI B450 Tomahawk Motherboard", "A good gaming mouse", 50),
			new Product(6, "https://cwsmgmt.corsair.com/media/hybris/tlc/mousepads/TLC_mousepads_banner.jpg", "Corsair MM800 Mousepad", "A good gaming mouse", 50),
			new Product(7, "https://www.computeruniverse.net/images/1000/907099826E2E31ED9D654B27B23DE455.jpg", "Corsair LL140 RGB Fans", "A good gaming mouse", 50),
			new Product(8, "https://images-na.ssl-images-amazon.com/images/I/7149ZGA38mL._SL1500_.jpg", "IKEA MICKE Workstation Desk", "A good gaming mouse", 50),
			new Product(9, "https://microless.com/cdn/products/0aa7a05f166306e967f35c791b9b0e95-hi.jpg", "Corsair Vengeance RGB", "A good gaming mouse", 50),
			new Product(10, "https://images-na.ssl-images-amazon.com/images/I/81ZWWtwWf6L._SL1500_.jpg", "Samsung 970 EVO Plus", "A good gaming mouse", 50),
			new Product(11, "https://i0.wp.com/content.crucial.com/content/dam/crucial/ssd-products/bx500/images/in-use/crucial-bx500-inuse-image-1.psd.transform/small-png/image.jpg?ssl=1", "Crucial BX500 250Gb", "A good gaming mouse", 50),
			new Product(12, "https://images.tweaktown.com/content/3/6/3633_01.jpg", "Corsair GS800 800W Power Supply", "A good gaming mouse", 50),
			new Product(13, "https://www.moddiy.com/product_images/u/587/IMG_8806s__19228_zoom.JPG", "Corsair Modular Sleeve", "Make your system look modern wiht these cables", 50),
			new Product(14, "https://sta3-nzxtcorporation.netdna-ssl.com/uploads/product_image/image/1779/large_bf09d83f5909eb72.jpg", "H500 NZXT", "A good gaming mouse", 50),
			new Product(15, "https://www.incredible.co.za/media/catalog/product/cache/3/image/1400x/0dc2d03fe217f8c83829496872af24a0/m/a/masterliquid_ml120r.png", "Cooler Master Liquid CPU Cooler", "A good gaming mouse", 50)
			
			));

			public List<Product> getAllProducts() {
				System.out.println("called");
				System.out.println(products);
				//List<Product> tableProducts = new ArrayList<Product>();
				return products;
			}

}
