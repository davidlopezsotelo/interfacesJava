package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {

		MarcoRaton marcoR=new MarcoRaton();
		
		marcoR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

//creamos el frame--------------------------------------

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		
		/*
		 * creamos un objeto de tipo EventoDeRaton,
		 * y lo ponemos a la escucha
		 */
		
		EventoDeRaton evento1=new EventoDeRaton();//creamos objeto
		
		addMouseListener(evento1);// lo ponemos a la escucha
	}
}

//creamos el oyente--------------------------------------

class EventoDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// cuando hacemos click y soltamos en raton
		
		System.out.println("Has hecho click.");

		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// cuando entras en la ventana
		
		System.out.println("Has entrado en ventana.");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// cuando sales de ventana
		System.out.println("acabas de salir de la ventana.");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// cuando presionamos en el raton
		
		System.out.println("acabas de presionar. ");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// cuando sueltas en el raton
		System.out.println("has soltado.");
		
	}
	
	
}