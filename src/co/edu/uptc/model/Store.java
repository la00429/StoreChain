package co.edu.uptc.model;

import co.edu.uptc.structures.DoubleList;

public class Store {
	private String name;
	private String address;
	private DoubleList<Product> products;

	public Store(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void registerProduct(Product product) {

	}

	public void showProduct(String code) {

	}

	public int calculateQuantityProducts() {
		return 0;

	}

	public double calculateTotalValueStore() {
		return 0.0;

	}

	private boolean sellProduct(String code, int quantity) {
		return false;
	}

}
