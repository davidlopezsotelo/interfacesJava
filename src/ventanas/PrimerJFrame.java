package ventanas;

import java.awt.*;

/**
 * 
 */
import javax.swing.*;



public class PrimerJFrame {

	public static void main(String[] args) {

		
	 	MiJFrame ventana=new MiJFrame () ;
	 	
	 	ventana.getDefaultCloseOperation();
	}
	
//
	
public static class MiJFrame extends JFrame{
		

		public  MiJFrame(){
			
			setSize(400, 250);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
			setLocationRelativeTo(null);
			
			setTitle("Ventana de DAVID");
			
			//CAMBIAR LA IMAGEN DEL ICOCNO DE LA VENTANA:
			
			Toolkit miSistema=Toolkit.getDefaultToolkit();
			
			Image miIcono=miSistema.getImage("C:\\Users\\David\\eclipse-workspace\\interfAaces\\gato.jpg");
			
			setIconImage(miIcono);
			
			setVisible(true);
			
		}
	}

}
