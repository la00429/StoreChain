package co.edu.uptc.structures;

import java.util.Iterator;

public class DoubleList<E> implements Iterable<E> {

	private NodeDouble<E> head;

	public DoubleList() {
		this.head = null;
	}

	public void insert(E data) {
		NodeDouble<E> node = new NodeDouble<E>(data);
		if (isEmpty()) {
			head = node;
		} else {
			NodeDouble<E> nodeAux = head;
			while (nodeAux.getNext() != null) {
				nodeAux = nodeAux.getNext();

			}
			nodeAux.setNext(node);
			node.setPrevius(nodeAux);

		}
	}

	public boolean exist(E data) {
		boolean nodeExist = false;
		NodeDouble<E> nodeAux = head;
		while (nodeAux != null && nodeExist == false) {
			if (nodeAux.getData().equals(data)) {
				nodeExist = true;
			}
			nodeAux = nodeAux.getNext();
		}
		return nodeExist;

	}

//	private void existValue(String attributeName, Object value) {
//	        List<E> result = new ArrayList<>();
//	        try {
//	            for (E item : lista) {
//	                Object attributeValue = item.getClass().getMethod("get" + attributeName).invoke(item);
//	                if (attributeValue.equals(value)) {
//	                    result.add(item);
//	                }
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return result;
//	    }

	public NodeDouble<E> prueba(E data) {
		boolean nodeExist = false;
		NodeDouble<E> nodeAux1 = head;
		NodeDouble<E> nodeAux = head;
		while (nodeAux != null && nodeExist == false) {
			if (nodeAux.getData().equals(data)) {
				nodeExist = true;
				nodeAux1 = nodeAux.getNext();
			}
			nodeAux = nodeAux.getNext();
		}
		return nodeAux1;

	}

	public void remove(E data) {
		NodeDouble<E> nodeAux = head;
		NodeDouble<E> previus = head;
		while (nodeAux != null) {
			if (nodeAux.getData().equals(data)) {
				removeNodeFound(nodeAux, previus);
			}
			nodeAux = nodeAux.getNext();
		}
	}

	private void removeNodeFound(NodeDouble<E> nodeAux, NodeDouble<E> previus) {
		NodeDouble<E> nodeToRemove = nodeAux;
		if (nodeToRemove == head) {
			head = nodeToRemove.getNext();
			nodeToRemove.getNext().setPrevius(null);

		} else {
			previusReference(previus, nodeToRemove);
		}
	}

	private void previusReference(NodeDouble<E> previus, NodeDouble<E> nodeToRemove) {
		while (previus.getNext() != nodeToRemove) {
			previus = previus.getNext();
		}

		previus.setNext(nodeToRemove.getNext());
		nodeToRemove.getNext().setPrevius(previus);
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public String show() {
		return this.head.toStringByHead();
	}

	public String showInverse() {
		return this.head.toStringToHead();
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterador;

		return iterador = new Iterator<E>() {
			// Atributo de la clase anónima;
			NodeDouble<E> actual = head;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return actual != null;
			}

			@Override
			public E next() {
				E data = actual.getData();
				actual = actual.getNext();

				return data;
			}

		};

	}

}
