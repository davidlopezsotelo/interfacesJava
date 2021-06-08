package ventanas;

import javax.swing.JFrame;

public class Ventana {

	public static void main(String[] args) {
		
				//CREACION DE VENTANA:
		
				JFrame miVentana=new JFrame();
				
				//TAMAÑO DE VENTANA:
				
				miVentana.setSize(400, 250);
				
				//ACCION CUANDO SE CIERRA:
				
				miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//POSICION DE VENTANA:
				
				miVentana.setLocation(600, 350);
				
				//HACE VISIBLE LA VENTANA(siempre al final):
				
				miVentana.setVisible(true);
	}

}
