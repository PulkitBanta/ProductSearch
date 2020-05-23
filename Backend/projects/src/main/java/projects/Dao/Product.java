package projects.Dao;

public class Product {
	private String image_url;
	private String name;
	private String description;
	private int price;
	
	public Product() {
			
	}
	
	public Product(String image_url, String name, String description, int price) {
		this.image_url = image_url;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}