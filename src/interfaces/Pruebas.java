package interfaces;

import javax.swing.JFrame;

public class Pruebas {

	public static void main(String[] args) {
		
		
		ventana2 win=new ventana2 ();
		
		win.getDefaultCloseOperation();
		
		win.getLocation();
	}
	
	
	public static class ventana2 extends JFrame{
		
		public ventana2() {
			
			JFrame miVentana=new JFrame();
		
		//TAMAÑO DE VENTANA:

		
		miVentana.setSize(400, 250);
		
		//ACCION CUANDO SE CIERRA:
		
		((JFrame) miVentana).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//POSICION DE VENTANA:
		
		miVentana.setLocation(600, 350);
		
		//HACE VISIBLE LA VENTANA(siempre al final):
		
		miVentana.setVisible(true);
		
		}// comentario añadido desde el repositorio de GitHub
	}

}
