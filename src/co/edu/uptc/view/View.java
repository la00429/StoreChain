package co.edu.uptc.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View {
	private JFrameApp jFrame;

	public View(ActionListener listener) {
		jFrame = new JFrameApp(listener);
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(jFrame, message);
	}
}
