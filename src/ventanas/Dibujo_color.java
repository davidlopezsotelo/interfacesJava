package ventanas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujo_color {
	
public static void main(String[] args) {
		
		MarcoConDibujos2 mimarco=new MarcoConDibujos2();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//CLASE QUE CREA EL FRAME-------------------------

class MarcoConDibujos2 extends JFrame{
	
	public MarcoConDibujos2() {
		
		setTitle("Dibuja en marco");
		
		setSize(400,400);
		
			// creamos un objeto lamina y lo añadimos al marco:
		
		LaminaConFigurasb lamina =new LaminaConFigurasb();
		
		add(lamina);
		
	}
}

//CLASE QUE CREA DIBUJOS EN EL FRAME-------------------------------

class LaminaConFigurasb extends JPanel{
	
	/*
	 * sobreescribimos el metodo paintcomponent
	 */
	
	public void paintComponent(Graphics g) {
		
			//llamamos al metodo de la clase padre:
	
		super.paintComponent(g);
		
			/*
			 * ya podemos usar los metodos 
			 * de la clase paintComponent
			 * para dibujar en el marco
			 */
		
		Graphics2D g2=(Graphics2D) g;
		
			//para dibujar un rectangulo, instanciamos la clase
			//Rectangle2d.
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
			//dibujamos el rectangulo usando el objeto g2 y el metodo
			//draw(Shape s)
		
		/*
		 * Añadimos el colorl rectangulo
		 */
		
		g2.setPaint(Color.RED);//pinta el trazo del color
		
		g2.fill(rectangulo);//rellena con color
		
			/*
			 * dibujamos una elipse dentro del rectangulo
			 */
		
		Ellipse2D elipse =new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		/*
		 * establecemos el color, pero esta vez
		 * instanciamos la clase color y añadimos 
		 * la mezcla de color deseado (R,G,B)
		 */
		
		g2.setPaint(new Color(100,170,50));
		
		g2.fill(elipse);
		
		
	}

}
