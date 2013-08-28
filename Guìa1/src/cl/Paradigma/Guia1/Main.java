package cl.Paradigma.Guia1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		CuentaAgua cuenta = new CuentaAgua(25000,"Rio Neuquen 2070","28/08/2013");
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		JLabel label = new JLabel(cuenta.getDireccion());
		frame.add(label);
		frame.setVisible(true);
	}

}
