package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogSellProduct extends JDialog {
	private static final long serialVersionUID = 1L;
	private JLabel code;
	private JTextField codeInput;
	private JLabel quantity;
	private JTextField quantityInput;
	private JButton sellProduct;
	private JButton goBack;

	public JDialogSellProduct(ActionListener listener) {
		this.setSize(600, 300);
		this.setModal(true);
		initComponents(listener);

	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc);
		secondLine(gbc);
		thirdLine(gbc, listener);
	}

	private void firstLine(GridBagConstraints gbc) {
		this.code = new JLabel("code");
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(code, gbc);

		codeInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(codeInput, gbc);
	}

	private void secondLine(GridBagConstraints gbc) {
		this.quantity = new JLabel("quantity");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(quantity, gbc);

		quantityInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(quantityInput, gbc);
	}

	private void thirdLine(GridBagConstraints gbc, ActionListener listener) {
		this.sellProduct = new JButton("Sell Product");
		this.sellProduct.setActionCommand("SellProduct");
		this.sellProduct.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(sellProduct, gbc);
		this.goBack = new JButton("Go Back");
		this.goBack.setActionCommand("GoBackStore");
		this.goBack.addActionListener(listener);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(goBack, gbc);
	}

	public String dataCode() {
		return codeInput.getText();
	}

	public String dataQuantity() {
		return quantityInput.getText();
	}

}
