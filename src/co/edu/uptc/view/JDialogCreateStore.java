package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogCreateStore extends JDialog {
	private JLabel name;
	private JTextField nameInput;
	private JLabel address;
	private JTextField addressInput;
	private JButton createStore;
	private JButton goBack;

	public JDialogCreateStore(ActionListener listener) {
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
		this.name = new JLabel("name");
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(name, gbc);

		nameInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(nameInput, gbc);
	}

	private void secondLine(GridBagConstraints gbc) {
		this.address = new JLabel("Address");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(address, gbc);

		addressInput = new JTextField(20);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(addressInput, gbc);
	}

	private void thirdLine(GridBagConstraints gbc, ActionListener listener) {
		this.createStore = new JButton("Create Store");
		this.createStore.setActionCommand("CreateStore");
		this.createStore.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(createStore, gbc);
		this.goBack = new JButton("Go Back");
		this.goBack.setActionCommand("GoBackChain");
		this.goBack.addActionListener(listener);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(goBack, gbc);
	}

	public String dataName() {
		return nameInput.getText();
	}

	public String dataAddress() {
		return addressInput.getText();
	}

}
