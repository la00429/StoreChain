package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDialogSeeProdcuts extends JDialog {
	private JTable products;
	private JScrollPane scroll;
	private JButton goBack;

	public JDialogSeeProdcuts(ActionListener listener) {
		this.setSize(new Dimension(getMaximumSize()));
		this.setModal(true);
		initComponents(listener);
	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc);
		secondLine(gbc, listener);

	}

	private void firstLine(GridBagConstraints gbc) {
		this.products = new JTable();
		this.scroll = new JScrollPane(products);
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;;
		this.add(scroll, gbc);
	}

	private void secondLine(GridBagConstraints gbc, ActionListener listener) {
		this.goBack = new JButton("Go Back");
		this.goBack.setActionCommand("GoBackStore");
		this.goBack.addActionListener(listener);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(goBack, gbc);
	}

	public void loadTable(ArrayList<Object> data, ArrayList<Object> columnNames) {
		DefaultTableModel model = new DefaultTableModel();
		for (Object nameColumn : columnNames) {
			model.addColumn(nameColumn);
		}
		for (Object product : data) {
			model.addRow(new Object[] { product });
		}
		products.setModel(model);
	}

}
