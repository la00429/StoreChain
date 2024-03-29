package co.edu.uptc.model;

import java.util.Iterator;

import co.edu.uptc.structures.SimpleList;

public class Chain {
	private SimpleList<Store> stores;

	public Chain() {
		this.stores = new SimpleList<Store>();

	}

	public void addStore(Store store) {
		this.stores.insert(store);
	}

	public double calculateTotalValueChain() {
		double totalValueStores = 0.0;
		Iterator<Store> iterador = stores.iterator();
		while (iterador.hasNext()) {
			totalValueStores = totalValueStores + iterador.next().calculateTotalValueStore();
		}
		return totalValueStores;
	}

	public Store searchStore(String name) {
		Store store = new Store(null, null);
		Iterator<Store> iterador = stores.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getName().equals(name)) {
				store = iterador.next();
			}
		}
		return store;

	}

}
