package eventos;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;


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

class PanelAccion extends JPanel{

	
	public PanelAccion() {
		
		
	}
	
	

}