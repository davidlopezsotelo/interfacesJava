package ventanas;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;


public class Dibujar_Frame {

	public static void main(String[] args) {
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//CLASE QUE CREA EL FRAME-------------------------

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Dibuja en marco");
		
		setSize(400,400);
		
			// creamos un objeto lamina y lo añadimos al marco:
		
		LaminaConFiguras lamina =new LaminaConFiguras();
		
		add(lamina);
		
	}
}

//CLASE QUE CREA DIBUJOS EN EL FRAME-------------------------------

class LaminaConFiguras extends JPanel{
	
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
		
		/*
		g.drawRect(50, 50, 200, 200);  //dibujamos un rectangulo
			
		g.drawLine(50, 50, 250, 250);  //dibujamos una diagonal
		
		g.drawLine(50, 250, 250, 50);
		
		g.drawOval(125, 125, 50, 50);  //dibujamos un ovalo circular
		*/
		
			/*
			 * Usando la clase Graphics2D:
			 * 
			 * hacemos una refundicion de muestro objeto graphics
			 * en un objeto graphics2D
			 */
		
		Graphics2D g2=(Graphics2D) g;
		
			//para dibujar un rectangulo, instanciamos la clase
			//Rectangle2d.
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
			//dibujamos el rectangulo usando el objeto g2 y el metodo
			//draw(Shape s)
		
		g2.draw(rectangulo);
		
			/*
			 * dibujamos una elipse dentro del rectangulo
			 */
		
		Ellipse2D elipse =new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
			/*
			 * Dibujamos una linea pero esta vez 
			 * la instaciamos dentro del metodo
			 */
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
			/*
			 * dibujamos un circulo que encierre
			 * el rectangulo
			 */
		
		//creamos dos variables para centrar el rectangulo
		
		double CentroenX=rectangulo.getCenterX();

		double CentroenY=rectangulo.getCenterY();
		
		//establecemos el radio del circulo 
		//igualamos el radio a la altura del rectangulo
		
		double radio =125;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenY, CentroenY, CentroenX+radio, CentroenY+radio);
		
		g2.draw(circulo);
		
		// y funciona como el culo....	
		
	}
}



