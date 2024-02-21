package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.uptc.model.exceptions.ProductFoundException;
import co.edu.uptc.model.exceptions.SaleNoMadeException;
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

	public void addProduct(Product product) throws ProductFoundException {
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (isExistProduct(product.getCode()) == false) {
				this.products.insert(product);
			} else {
				throw new ProductFoundException();
			}
		}
	}

	private boolean isExistProduct(int code) {
		boolean isExist = false;
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getCode() == code) {
				isExist = true;
			}
		}
		return isExist;
	}

	public Product searchProduct(int code) {
		Product product = new Product(0, null, 0, 0);
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getCode() == code) {
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
//Lanzar la exepción de venta no realizada. 

	public void sellProduct(int code, int quantity) throws SaleNoMadeException {
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (this.products.exist(searchProduct(code)) && iterador.next().getQuantity() > quantity) {
				iterador.next().setQuantity(iterador.next().getQuantity() - quantity);
			} else {
				throw new SaleNoMadeException();
			}
		}
	}

	public void removeProductRange(int upperCode, int lowerCode) {
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getCode() >= lowerCode && iterador.next().getCode() <= upperCode) {
				this.products.remove(iterador.next());
			}
		}
	}

	public ArrayList<Product> showListProducst() {
		ArrayList<Product> listProducts = new ArrayList<Product>();
		Iterator<Product> iterador = products.iterator();
		while (iterador.hasNext()) {
			listProducts.add(iterador.next());
		}
		return listProducts;
	}
	
	public String getName() {
		return name;
	}

}
