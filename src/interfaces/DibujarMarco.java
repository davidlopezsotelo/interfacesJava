package interfaces;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class DibujarMarco {

	public static void main(String[] args) {
		
		MarcoConDibujos mimarco= new MarcoConDibujos();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
//CLASE QUE CREA EL MARCO

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		setTitle("Prueba dibujos");
		setSize(400,400);
		
		LaminaConFiguras milamina= new LaminaConFiguras();
		
		add(milamina);
		
		
	}
}

//CLASE QUE CREA DIBUJOS EN EL MARCO 

class LaminaConFiguras extends JPanel{
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		/*
		g.drawRect(50, 50, 200, 200);
				
		g.drawArc(50, 50, 100, 100, 125, 150);
		
		g.drawString("texto de prueba", 100, 100);//dibuja el texto*/

		
		//comentar codigo superior para seguir
		
		//-------------------------------------------
		
		//casting que convierte objeto de tipo graphisc en graphics2D
		
		Graphics2D g2=(Graphics2D) g;
		
		//instancia directa de la clase abstracta Graphics2D
		
		Rectangle2D rectangulo =new Rectangle2D.Double(100, 100, 225, 150);
		
		g2.draw(rectangulo);
		
		//crear objeto elipse para dibujar elipses de la clase Ellipse2D
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		//dimensionamos la elipse con las dimensiones del objeto rectangulo
		
		elipse.setFrame(rectangulo);
		
		//dibujamos la elipse
		
		g2.draw(elipse);
		
		/* 
		 Dibujamos una linea usando la clase Line2D 
		 instanciandola directamente  dentro de la clase
		 */
		
		g2.draw(new Line2D.Double(100,100,325,250));
		
		//dibujar circulo centrado en rectangulo (revisar)
		
		
		double CentroEnX= rectangulo.getCenterX();	
		
		double CentroEnY=rectangulo.getCenterY();
		
		double radio=150;
		
		Ellipse2D circulo =new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroEnX, CentroEnX, CentroEnX+radio, CentroEnY+radio);
		
		g2.draw(circulo);
		
		
	}
}