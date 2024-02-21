package co.edu.uptc.model.exceptions;

public class ProductFoundException extends Exception {

	public ProductFoundException() {
		super("El producto con ese ID ya existe en el almacén.");
	}

}
