package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {

		MarcoEventoVentana mimarco= new MarcoEventoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		mimarco.addWindowListener(new EventosDeVentana());
	
	
	}
	
static class MarcoEventoVentana extends JFrame{
		
		public MarcoEventoVentana() {
			
			setBounds(300,300,600,350);
			setVisible(true);
			
			}
	}

static class EventosDeVentana extends WindowAdapter{

	public void windowClosed (WindowEvent e) {
		System.out.println("Adios.");
	}
	
}

}
