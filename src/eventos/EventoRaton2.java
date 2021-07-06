package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EventoRaton2 {
	
	//usaremos la clase mouse event

	public static void main(String[] args) {
		
		MarcoRaton2 marcoR2=new MarcoRaton2();
		
		marcoR2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		
		/*
		 * creamos un objeto de tipo EventoDeRaton,
		 * y lo ponemos a la escucha
		 */
		
		EventoDeRaton2 evento2=new EventoDeRaton2();//creamos objeto
		
		addMouseListener(evento2);// lo ponemos a la escucha
	}
}
	/*
	 * creamos la clase eventos pero
	 *en ved de implementar la interfaz MouseListener
	 *extenderemos la clase adaptadora
	 *MouseAdapter, para utilizar solo los metodos
	 *que nos convenga, sin tener que implementarlos todos.
	 */


class EventoDeRaton2 extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {
		
		/*
		 * utilizamos el parametro e, para acceder
		 * a todos los metodos de MouseEvent
		 */
		
		System.out.println("Coordenada X: "+e.getX()+ ", Coordenada Y: "+e.getY());
		
		//nos dice las coordenadas donde hacemos click
		
		System.out.println(e.getClickCount());//cuenta los clisck seguidos
		
		System.out.println(e.getButton());//nos dice el numero de la tecla del raton
		
		
		
	}
	
}
