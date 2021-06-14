package interfaces;

import java.awt.*;

import javax.swing.*;

public class EscribirMarco {

	public static void main(String[] args) {

		MarcoTexto mimarco=new MarcoTexto();
			
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
} 

	//CLASE QUE CREA EL MARCO

	class MarcoTexto extends JFrame{
		
		public MarcoTexto () {
			
			setVisible(true);
			setSize(600,450);
			setLocation(400,200);
			setTitle("Primer texto");//titulo del marco
			
			Lamina miLamina=new Lamina();//crea la lamina en el marco
			
			add (miLamina);//añade la lamina al marco
			
		}

}
	
	//CLASE QUE CREA EL PANEL(lamina)
	
	class Lamina extends JPanel{
		
		//sobreescrivir el metodo PaintComponent
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);//invoca al metodo de la clase padre
			
			g.drawString("texto de prueba", 100, 100);//dibuja el texto
			
			
		}
		
		
}
