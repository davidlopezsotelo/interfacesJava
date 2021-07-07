package eventos;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

//https://www.youtube.com/watch?v=8FQnwZrr8Ck&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=77

public class EventosMultiples {

	public static void main(String[] args) {
		
		MarcoAccion marco=new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);	
	}
}

//creamos el marco y la lamina -----------------

class MarcoAccion extends JFrame{
	
	public  MarcoAccion() {
		
		setTitle("Prueba acciones");
		
		setBounds(600,350,600,300);
		
		PanelAccion lamina=new PanelAccion();
		
		add(lamina);
		
	}
	
}

/*
 * Creamos el panel con los botones -----------------------------------------------
 */

class PanelAccion extends JPanel{

	
	public PanelAccion() {// constructor de la lamina o panel---------------------
		
		/*
		 * instanciamos la clase accioncolor para crear
		 * los botones en la lamina
		 * pasando los parametros al constructor
		 */
		
		AccionColor accionAmarillo=new AccionColor("Amarillo",new ImageIcon("src/color_amarillo.png"),Color.YELLOW);
		
		AccionColor accionAzul=new AccionColor("Azul",new ImageIcon("src/color_azul.png"),Color.BLUE);
		
		AccionColor accionRojo=new AccionColor("Rojo",new ImageIcon("src/color_rojo.png"),Color.RED);
		

		//construimos los botones
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		/*
		 * ahora construimos la acion por teclado
		 */
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		/*
		 * creamos la combinacion de teclas
		 */
		
		KeyStroke teclaAmarilla=KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRoja=KeyStroke.getKeyStroke("ctrl R");
		
		/*
		 * asignamos la combinacion de teclas a un objeto
		 */
		
		mapaEntrada.put(teclaAmarilla, "fondo_amarillo");
		mapaEntrada.put(teclaAzul, "fondo_azul");
		mapaEntrada.put(teclaRoja, "fondo_rojo");
		
		
		/*
		 * asignamos el objeto a la accion
		 */
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
	}
	
	
	//CLASE OYENTE, QUE CAMBIARA DE COLOR EL PANEL---------------

	/*
	 * clase interna,encapsulada (para que herede de JPanel)
	 * que hereda de la interfaz Action y que trata
	 * los eventos como objetos
	 */

	private class AccionColor extends AbstractAction{
		
		/*
		 * creamos el constructor de la clase
		 * con los parametros que queramos añadir--------------------
		 * para guardar .
		 */
		
		public AccionColor(String nombre,Icon icono,Color color_boton) {//constructor
			
			//guardamos el nombre en formato de clave:valor
			putValue(Action.NAME,nombre);
			
			//guardanos el icono.
			putValue(Action.SMALL_ICON,icono);
			
			//guardamos la descripcion del boton
			putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color"+nombre);
			
			//guardamos la accion del boton
			putValue("Color_de_fondo",color_boton);
		}

		//accion que se debe realizar al pulsar un boton--------
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			/*
			 * declaramos una variable de tipo color y le 
			 * pasamos el valor como parametro, el cual sera el que
			 * tenga almacenado en Color_de_fondo
			 * 
			 * tendremos que hacer un castin de string a Color
			 */
			
			Color c=(Color) getValue("Color_de_fondo");
			
			//ponemos la lamina del color guardado en c
			
			setBackground(c);	
		}	
	}
}




