package co.edu.uptc.model;

import java.util.Iterator;

import co.edu.uptc.structures.DoubleList;

public class Store {
	private String name;
	private String address;
	private DoubleList<Product> products;

	public Store(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.products = new DoubleList<Product>();
	}

	public void registerProduct(Product product) {
		this.products.insert(product);
	}

	public Product showProduct(String code) {
		Product product = new Product(null, null, 0, 0);
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getCode().equals(code)) {
				product = iterador.next();
			}
		}
		return product;
	}

	public int calculateQuantityProducts() {
		int countProducts = 0;
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			iterador.next();
			countProducts++;
		}
		return countProducts;

	}

	public double calculateTotalValueStore() {
		double totalValue = 0.0;
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			totalValue = totalValue + (iterador.next().getPrice() * iterador.next().getQuantity());
		}

		return totalValue;

	}

	private boolean sellProduct(String code, int quantity) {
		boolean isSaleProduct = false;
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (this.products.exist(showProduct(code))) {
				if (iterador.next().getQuantity() > quantity) {
					isSaleProduct = true;
				}
			}s
		}
		return isSaleProduct;
	}

}
