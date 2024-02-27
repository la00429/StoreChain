package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogSearchProduct extends JDialog {
	private JTextField codeProduct;
	private JButton searchProduct;
	private JLabel code;
	private JLabel codeOutput;
	private JLabel name;
	private JLabel nameOutput;
	private JLabel quantity;
	private JLabel quantityOutput;
	private JLabel price;
	private JLabel priceOutput;

	private JButton goBack;

	public JDialogSearchProduct(ActionListener listener) {
		this.setSize(600, 300);
		this.setModal(true);
		initComponents(listener);

	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		zeroLine(gbc, listener);
		firstLine(gbc, listener);
		secondLine(gbc, listener);
		thirdLine(gbc, listener);
		forthLine(gbc, listener);
		fifthLine(gbc, listener);
	}

	private void zeroLine(GridBagConstraints gbc, ActionListener listener) {
		this.codeProduct = new JTextField(20);
		gbc.gridwidth = 1;
		add(codeProduct, gbc);

		this.searchProduct = new JButton("Search Product");
		searchProduct.setActionCommand("SearchProduct");
		searchProduct.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(searchProduct, gbc);
	}

	private void firstLine(GridBagConstraints gbc, ActionListener listener) {
		this.code = new JLabel("Code: ");
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(code, gbc);

		codeOutput = new JLabel();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(codeOutput, gbc);

	}

	private void secondLine(GridBagConstraints gbc, ActionListener listener) {
		this.name = new JLabel("Name: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(name, gbc);

		nameOutput = new JLabel();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(nameOutput, gbc);

	}

	private void thirdLine(GridBagConstraints gbc, ActionListener listener) {
		this.quantity = new JLabel("Quantity: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(quantity, gbc);

		quantityOutput = new JLabel();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(quantityOutput, gbc);
	}

	private void forthLine(GridBagConstraints gbc, ActionListener listener) {
		this.price = new JLabel("Price: ");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(price, gbc);

		priceOutput = new JLabel();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(priceOutput, gbc);
	}

	private void fifthLine(GridBagConstraints gbc, ActionListener listener) {
		this.goBack = new JButton("Go Back");
		goBack.setActionCommand("GoBackStore");
		goBack.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;;
		add(goBack, gbc);

	}

	public void CodeOut(String value) {
		codeOutput.setText(value);
	}

	public void nameOut(String value) {
		nameOutput.setText(value);
	}

	public void quantityOut(String value) {
		quantityOutput.setText(value);
	}

	public void priceOut(String value) {
		priceOutput.setText(value);
	}

}
