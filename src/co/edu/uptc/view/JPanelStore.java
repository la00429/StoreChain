package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelStore extends JPanel {
	private JLabel name;
	private JLabel address;
	private JButton addProduct;
	private JButton searchProduct;
	private JButton sellProduct;
	private JButton removeProducts;
	private JButton seeTableProducts;
	private JLabel quantityProducts;
	private JLabel valueTotal;

	public JPanelStore(ActionListener listener) {
		initComponents(listener);

	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		firstLine(gbc);
		secondLine(gbc);
		thirdLine(listener, gbc);
		forthLine(gbc);

		fifthLine(gbc);
	}

	private void firstLine(GridBagConstraints gbc) {
		this.name = new JLabel();
		gbc.anchor = new GridBagConstraints().REMAINDER;
		this.add(name, gbc);
	}

	private void secondLine(GridBagConstraints gbc) {
		this.address = new JLabel();
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		gbc.gridwidth = 1;
		this.add(address, gbc);
	}

	private void thirdLine(ActionListener listener, GridBagConstraints gbc) {
		thirdLineA(listener, gbc);
		thirdLineB(listener, gbc);
		thirdLineC(listener, gbc);
		thirdLineD(listener, gbc);
		thirdLineE(listener, gbc);
	}

	private void thirdLineA(ActionListener listener, GridBagConstraints gbc) {
		this.addProduct = new JButton("Register product");
		this.addProduct.setActionCommand("RegisterProductOption");
		this.addProduct.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_END;
		gbc.gridwidth = 1;
		this.add(addProduct, gbc);
	}

	private void thirdLineB(ActionListener listener, GridBagConstraints gbc) {
		this.searchProduct = new JButton("Search Product");
		this.searchProduct.setActionCommand("SearchProductOption");
		this.searchProduct.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		this.add(searchProduct, gbc);
	}

	private void thirdLineC(ActionListener listener, GridBagConstraints gbc) {
		this.sellProduct = new JButton("Sell Product");
		this.sellProduct.setActionCommand("SellProductOption");
		this.sellProduct.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		this.add(sellProduct, gbc);

	}

	private void thirdLineD(ActionListener listener, GridBagConstraints gbc) {
		this.removeProducts = new JButton("Remove Product");
		this.removeProducts.setActionCommand("RemoveProductOption");
		this.removeProducts.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		this.add(removeProducts, gbc);

	}

	private void thirdLineE(ActionListener listener, GridBagConstraints gbc) {
		this.seeTableProducts = new JButton("See Table Products");
		this.seeTableProducts.setActionCommand("SeeTableProductsOption");
		this.seeTableProducts.addActionListener(listener);
		gbc.anchor = new GridBagConstraints().FIRST_LINE_START;
		this.add(seeTableProducts, gbc);

	}

	private void forthLine(GridBagConstraints gbc) {
		this.quantityProducts = new JLabel("");
		gbc.anchor = new GridBagConstraints().FIRST_LINE_END;
		this.add(quantityProducts, gbc);

	}

	private void fifthLine(GridBagConstraints gbc) {
		this.valueTotal = new JLabel("");
		gbc.anchor = new GridBagConstraints().FIRST_LINE_END;
		this.add(valueTotal, gbc);
	}

	public void totalQuantity(int value) {
		this.quantityProducts.setText(String.valueOf(value));
	}

	public void totalValue(Double value) {
		this.valueTotal.setText(String.valueOf(value) + " COP");
	}

	public void showNameStore(String nameStore) {
		this.name.setText(nameStore);
	}
}
