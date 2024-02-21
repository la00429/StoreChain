package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialogChooseStore extends JDialog {
	private JLabel storesName;
	private JComboBox<String> stores;
	private JButton chooseStore;
	private JButton goBack;

	public JDialogChooseStore(ActionListener listener) {
		this.setSize(600, 300);
		this.setModal(true);
		initComponents(listener);
	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc, listener);
		secondLine(gbc, listener);

	}

	private void firstLine(GridBagConstraints gbc, ActionListener listener) {
		this.storesName = new JLabel("Eliga un almacen: ");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridwidth = 1;
		add(storesName, gbc);

		this.stores = new JComboBox<String>();
		stores.setActionCommand("Select Store");
		stores.addActionListener(listener);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(stores, gbc);
	}

	private void secondLine(GridBagConstraints gbc, ActionListener listener) {
		this.chooseStore = new JButton("Choose Store");
		chooseStore.setActionCommand("chooseStore");
		chooseStore.addActionListener(listener);
		gbc.gridwidth = GridBagConstraints.FIRST_LINE_START;
		add(chooseStore);

		this.goBack = new JButton("Go Back");
		goBack.setActionCommand("GoBackChain");
		goBack.addActionListener(listener);
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.REMAINDER;
		add(goBack, gbc);

	}

	public void loadComboBox(ArrayList<Object> items) {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		model.addElement("Select Store");
		for (Object object : items) {
			model.addElement(object.toString());
		}
		stores.setModel(model);
	}

	public String selectItem() {
		return (String) stores.getSelectedItem();
	}

	public JComboBox<String> getWords() {
		return this.stores;
	}

}
