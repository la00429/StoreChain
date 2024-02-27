package co.edu.uptc.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.model.Chain;
import co.edu.uptc.view.View;

public class Presenter implements ActionListener {
	private Chain chain;
	private View view;

	public Presenter() {
		Chain chain = new Chain();
		View view = new View(this);
	}

	public void loadData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String source = e.getActionCommand();
		if (source.equals("CreateStoreOption")) {

		}

		if (source.equals("ChooseStoreOption")) {

		}

		if (source.equals("SeeStoreOption")) {

		}

		if (source.equals("CreateStore")) {

		}

		if (source.equals("ChooseStore")) {

		}

		if (source.equals("GoBackChain")) {

		}
		
		if (source.equals("RegisterProductOption")) {

		}

		if (source.equals("RegisterProduct")) {

		}

		if (source.equals("SearchProductOption")) {

		}

		if (source.equals("SearchProduct")) {

		}

		if (source.equals("SellProductOption")) {

		}

		if (source.equals("SellProduct")) {

		}

		if (source.equals("RemoveProductOption")) {

		}

		if (source.equals("RemoveProduct")) {

		}

		if (source.equals("SeeTableProductsOption")) {

		}

		if (source.equals("GoBackStore")) {

		}

	}

}
