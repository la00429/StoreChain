package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelChain extends JPanel {
	private JLabel name;
	private JButton createStore;
	private JButton chooseStore;
	private JButton seeStore;
	private JLabel valueTotalChain;

	public JPanelChain(ActionListener listener) {
		initComponents(listener);
	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc);
		secondLine(listener, gbc);
		thirdLine(gbc);
	}

	private void firstLine(GridBagConstraints gbc) {
		this.name = new JLabel();
		gbc.anchor = new GridBagConstraints().REMAINDER;
		this.add(name, gbc);
	}

	private void secondLine(ActionListener listener, GridBagConstraints gbc) {
		this.createStore = new JButton("Create Store");
		this.createStore.setActionCommand("CreateStoreOption");
		this.createStore.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_END;
		gbc.gridwidth = 1;
		this.add(createStore, gbc);

		this.chooseStore = new JButton("Choose Store");
		this.chooseStore.setActionCommand("ChooseStoreOption");
		this.chooseStore.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		this.add(chooseStore, gbc);

		this.seeStore = new JButton("See Store");
		this.seeStore.setActionCommand("SeeStoreOption");
		this.seeStore.addActionListener(listener);
		gbc.gridwidth = new GridBagConstraints().REMAINDER;
		this.add(seeStore, gbc);
	}

	private void thirdLine(GridBagConstraints gbc) {
		this.valueTotalChain = new JLabel("");
		gbc.anchor = new GridBagConstraints().FIRST_LINE_END;
		this.add(valueTotalChain, gbc);
	}

	public void totalValueChain(Double value) {
		this.valueTotalChain.setText(String.valueOf(value) + " COP");
	}

}
