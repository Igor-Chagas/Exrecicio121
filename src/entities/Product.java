package entities;

public class Product {
	
	private String nameProduct;
	private Double price;
	
	public Product (String nameProduct, Double price) {
		this.nameProduct = nameProduct;
		this.price = price;
	}
	
	public String getNameProduct () {
		return nameProduct;
	}
	
	public Double getPrice() {
		return price;
	}
	
}
