package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco1 {
	
	//la ventana o componete que tiene el foco, es la que esta seleccionada.

	public static void main(String[] args) {
		
		MarcoFoco marco1=new MarcoFoco();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}

//construimos el marco----------------------------------

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
	
	setVisible(true);
	
	setBounds(300,300,600,450);
	
	add(new LaminaFoco1());//añadimos el panel(lamina)
	
	}
}

//construimos el JPanel--------------------------------

class LaminaFoco1 extends JPanel{
	
	public void paintComponent(Graphics e) {
		
		super.paintComponent(e);
		
		/*
		 * invalidamos el layout por defecto
		 */
		
		setLayout(null);
		
		/*
		 * creamos dos cuadros de texto
		 * usando la clase JTextField
		 */
		
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		
		/*
		 * les damos tamaño y posicion
		 * dentro del panel
		 */

		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		//agregamos los cuadros de texto a la lamina
		
		add(cuadro1);
		add(cuadro2);

		 
		/*
		 * creamos un objeto de tipo Lanzafocos
		 * para decirle al cuadro lo que tiene que hacer
		 * cuando tenga el foco
		 */
		
		LanzaFocos elFoco=new LanzaFocos();
		
		// ponemos el primer cuadro a la escucha
		
		cuadro1.addFocusListener(elFoco);

	}
	
	/*
	 * creamos dos variables objeto fuera del constructor(ambito de clase)
	 * pertenecientes a la clase JTextField
	 */
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	/*
	 * creamos una clase interna (encapsulada)
	 * para que realice las acciones de foco
	 * accediendo a cuadro1 y cuadro2
	 */
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// accion que hara cuando gana el foco
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// accion que hara cuando pierda el foco
			
			/*
			 * verificar si se ha introducido una direccion 
			 * de correro electronico valida
			 */
			
			
			/*
			 * creamos una variable String
			 * que capture el texto que hay en cuadro1
			 */
			
			String email=cuadro1.getText();
			
			boolean comprobacion=false;
			
			/*
			 * recorremos con un bucle for
			 * el texto para evaluar si hay una arroba
			 */

			for(int i=0;i<email.length();i++) 
			{
				//evaluamos los caracteres
				
				if(email.charAt(i)=='@') 
				{
				  comprobacion=true;//si existe @...
				}
			}
			
			/*
			 * si hay @ en el texto, la variable comprobacion pasa a true
			 * tenemos que evaluarla y decirle al programa
			 * lo que deve hacer
			 */
			
			if(comprobacion) 
			{
				System.out.println("correcto");
			}else {
				System.out.println("Formato de email, no valido.");
			}
			
		}
		
	}

}

