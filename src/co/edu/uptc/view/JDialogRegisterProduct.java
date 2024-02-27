package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogRegisterProduct extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel code;
	private JTextField codeInput;
	private JLabel name;
	private JTextField nameInput;
	private JLabel quantity;
	private JTextField quantityInput;
	private JLabel price;
	private JTextField priceInput;

	private JButton registerProduct;
	private JButton goBack;

	public JDialogRegisterProduct(ActionListener listener) {
		this.setSize(600, 300);
		this.setModal(true);
		initComponents(listener);

	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc);
		secondLine(gbc);
		thirdLine(gbc);
		forthLine(gbc);
		fifthLine(gbc, listener);
	}

	private void firstLine(GridBagConstraints gbc) {
		this.code = new JLabel("Code: ");
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(code, gbc);

		codeInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(codeInput, gbc);
	}

	private void secondLine(GridBagConstraints gbc) {
		this.name = new JLabel("Name: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(name, gbc);

		nameInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(nameInput, gbc);
	}

	private void thirdLine(GridBagConstraints gbc) {
		this.quantity = new JLabel("Quantity: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(quantity, gbc);

		quantityInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(quantityInput, gbc);
	}

	private void forthLine(GridBagConstraints gbc) {
		this.price = new JLabel("Price: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(price, gbc);

		priceInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(priceInput, gbc);
	}

	private void fifthLine(GridBagConstraints gbc, ActionListener listener) {
		this.registerProduct = new JButton("Register Product");
		this.registerProduct.setActionCommand("RegisterProduct");
		this.registerProduct.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(registerProduct, gbc);
		
		this.goBack = new JButton("Go Back");
		this.goBack.setActionCommand("GoBackStore");
		this.goBack.addActionListener(listener);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(goBack, gbc);
	}

	public String dataCode() {
		return codeInput.getText();
	}

	public String dataName() {
		return nameInput.getText();
	}

	public String dataQuantity() {
		return quantityInput.getText();
	}

	public String dataPrice() {
		return priceInput.getText();
	}

}
