package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {

		/*
		 * Creamos un objeto marco,de tipo
		 * marcoconteclas
		 */
		
		MarcoConTeclas mimarco= new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

//creamos el marco (Frame)-----------------------------

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas () {//constructor del marco
		
		setVisible(true);
		setBounds(700,300,600,450);
		
		
		/*
		 * instanciamos la clase oyente que hwemos construido
		 * y la ponemos a la escucha, dentro del constructor
		 * del marco
		 */
		
		EventoDeTeclado tecla =new EventoDeTeclado();
		
		addKeyListener(tecla);
		
		
	}
	
}

//CONSTRUIMOS EL OBJETO OYENTE------------------

	/*
	 * implementamos la Clase adaptadora KeyListener
	 * agregamos los metodos de la interfaz de forma automatica
	 * 
	 */

 class EventoDeTeclado implements KeyListener{
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// evento al presionar
		
		int codigo=e.getKeyCode();//nos devueve el codigo de la tecla pulsada
		System.out.print(codigo+" es el codigo de la letra: ");//imprime en consola el valor numerico de la tecla
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// evento al soltar
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// evento al presionar y soltar
		
		char letra =e.getKeyChar();
		System.out.println(letra);
		
		
		
	}
	
}
