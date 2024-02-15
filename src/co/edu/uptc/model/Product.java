package co.edu.uptc.model;

public class Product {
	private String code;
	private String name;
	private int quantity;
	private double price;

	public Product(String code, String name, int quantity, double price) {
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "[" + code + "," + name + "," + quantity + "," + price + "]";
	}

}
