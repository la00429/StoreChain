package co.edu.uptc.structures;

public class NodeDouble<E> {
	private NodeDouble<E> previus;
	private E data;
	private NodeDouble<E> next;

	public NodeDouble(E data) {
		this.data = data;
	}

	public NodeDouble<E> getPrevius() {
		return this.previus;
	}

	public void setPrevius(NodeDouble<E> previus) {
		this.previus = previus;
	}

	public E getData() {
		return this.data;
	}

	public NodeDouble<E> getNext() {
		return this.next;
	}

	public void setNext(NodeDouble<E> next) {
		this.next = next;
	}

	public String toStringByHead() {
		return  data + "->" + next;
	}
	
//	mostrar hacia atrás
	public String toStringToHead() {
		return previus + "->" + data;
	}

	

}
