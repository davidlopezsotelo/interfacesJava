package ventanas;
import java.awt.*;
import javax.swing.*;

public class Escribe_Frame {

	public static void main(String[] args) {

			//INSTANCIAMOS LA CLASE PROPIA "MarcoConTexto"
		
		MarcoConTexto mimarco=new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

//CREAMOS CLASE PARA ESCRIBIR EN EL MARCO(FRAME)-----------------------------------


class MarcoConTexto extends JFrame{
	
		// CREAMOS CONSTRUCTOR DE LA CLASE
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("primer texto");
		
		//incluimos la lamina que hemos creado:
		
			//creamos un objeto de tipo lamina
		
		Lamina milamina=new Lamina();
		
			// añadimos la lamina al marco

		add(milamina);
		
	}
	
}


//CREAMOS UNA CLASE PARA DISEÑAR EL PANEL(o lamina) ---------------------------------

class Lamina extends JPanel{
	
		//SOBREESCRIBIMOS EL METODO painComponent
		// QUE RECIBE UN PARAMETRO DE TIPO Graphics
			
	public void paintComponent(Graphics g) { //no funciona?????
		
			/*
			 * tenemos que invocar al metodo PaintComponent 
			 * de la clase padre JComponent, para que funcione
			 */
		
		super.paintComponent(g);
		
		g.drawString("Prueba escritura", 200, 100);
		
		
		
	}
	
}
