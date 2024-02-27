package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogRemoveProduct extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel valueFirst;
	private JTextField valueFirstInput;
	private JLabel valueEnd;
	private JTextField valueEndInput;
	private JButton removeProduct;
	private JButton goBack;

	public JDialogRemoveProduct(ActionListener listener) {
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
		this.valueFirst = new JLabel("Value First");
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(valueFirst, gbc);

		valueFirstInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(valueFirstInput, gbc);
	}

	private void secondLine(GridBagConstraints gbc) {
		this.valueEnd = new JLabel("Value End");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(valueEnd, gbc);

		valueEndInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(valueEndInput, gbc);
	}

	private void thirdLine(GridBagConstraints gbc, ActionListener listener) {
		this.removeProduct = new JButton("Remove Product");
		this.removeProduct.setActionCommand("RemoveProduct");
		this.removeProduct.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(removeProduct, gbc);
		this.goBack = new JButton("Go Back");
		this.goBack.setActionCommand("GoBackStore");
		this.goBack.addActionListener(listener);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(goBack, gbc);
	}

	public String dataValueFirst() {
		return valueFirstInput.getText();
	}

	public String dataValueEnd() {
		return valueEndInput.getText();
	}

}
