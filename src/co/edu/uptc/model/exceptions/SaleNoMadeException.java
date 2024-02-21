package co.edu.uptc.model.exceptions;

public class SaleNoMadeException extends Exception {
	public SaleNoMadeException() {
		super("La venta no se ha realizado");
	}

}
