package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

//CLASE QUE CREA 2 VENTANAS.(incluye Main y el resto de clases)-------------------

public class EventoFoco2 extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		
		//insatnciamos la propia clase
		
		EventoFoco2 miv=new EventoFoco2();
		
		miv.iniciar();
		
		

	}
	
//creamos metodo para construir los marcos de las ventanas---------------
	
	public void iniciar(){
		
		//instanciamos e iniciamos las variables
		
		marco1=new EventoFoco2();
		
		marco2=new EventoFoco2();
		
		//le damos valores
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300, 100, 600, 350); // izquierda
		marco2.setBounds(1200, 100, 600, 350);//derecha
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//ponemos los marcos a la escucha
		
		marco1.addWindowFocusListener(this);//this=esta es la clase oyente
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// accion cuando gana el foco
		
		/*
		 * aparecera un indicativo en el titulo
		 * de la ventana qeu tiene el foco
		 */
		
		if(e.getSource()==marco1) {
			
			marco1.setTitle("Tengo el foco!!!");
		}else {
			marco2.setTitle("Tengo el foco!!!");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// accion cuando pierde el foco
		
		/*
		 * el titulo quedara vacio
		 * cuando pierde el foco
		 */
		
		if(e.getSource()==marco1) {
			
			marco1.setTitle(" ");
		}else {
			marco2.setTitle(" ");
		}
		
	}
	
	//creamos dos variables EventoFoco2, que creara las ventanas
	
	EventoFoco2 marco1;
	EventoFoco2 marco2;
	
	

}
