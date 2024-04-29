package View;

import javax.swing.JOptionPane;

public class Int_GUI {	

	public static void menu() {
		
		int op = 0;
		
		while(op != 3) {			
			String x = JOptionPane.showInputDialog(null, "1-Consultar\n2-Efetuar Reserva\n3-Sair");
			op = Integer.parseInt(x);
			
			switch(op) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Encerrando programa");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
			}
		}
		
	}
}
