package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class JFrameApp extends JFrame {

	private JPanelApp jPanel;
	private JPanelChain jPanelChain;
	private JDialogCreateStore jDialogCreateStore;
	private JDialogChooseStore jDialogChooseStore;
	private JDialogSeeStores jDialogSeeStores;
	private JPanelStore jPanelStore;
	private JDialogRegisterProduct jDialogRegisterProduct;
	private JDialogSearchProduct jDialogSearchProduct;
	private JDialogSellProduct jDialogSellProduct;
	private JDialogRemoveProduct jDialogRemoveProduct;
	private JDialogSeeProdcuts jDialogSeeProdcuts;

	public JFrameApp(ActionListener listener) {
		super("Chain");
		this.setSize(new Dimension(getMaximumSize()));
		initComponents(listener);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initComponents(ActionListener listener) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		this.jDialogCreateStore = new JDialogCreateStore(listener);
		add(jDialogCreateStore, gbc);
		this.jDialogChooseStore = new JDialogChooseStore(listener);
		add(jDialogChooseStore, gbc);
		this.jDialogSeeStores = new JDialogSeeStores(listener);
		add(jDialogSeeStores, gbc);
		this.jDialogRegisterProduct = new JDialogRegisterProduct(listener);
		add(jDialogRegisterProduct, gbc);
		this.jDialogSearchProduct = new JDialogSearchProduct(listener);
		add(jDialogSearchProduct, gbc);
		this.jDialogSellProduct = new JDialogSellProduct(listener);
		add(jDialogSellProduct, gbc);
		this.jDialogRemoveProduct = new JDialogRemoveProduct(listener);
		add(jDialogRemoveProduct, gbc);
		this.jDialogSeeProdcuts = new JDialogSeeProdcuts(listener);
		add(jDialogSeeProdcuts, gbc);
	}

	private void initializationPanel(ActionListener listener, GridBagConstraints gbc) {
		
		this.jPanelChain = new JPanelChain(listener);
		add(jPanelChain, gbc);
		this.jPanelStore = new JPanelStore(listener);
		add(jPanelStore, gbc);
	}
	private void initializationPanelPrincipal(GridBagConstraints gbc) {
		this.jPanel = new JPanelApp();
		add(jPanel, gbc);

	}

}
