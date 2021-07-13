package eventos;

import java.awt.event.*;
import javax.swing.*;


public class Varios_oyentes {

	public static void main(String[] args) {
		
		Marco_Principal miMarco=new Marco_Principal();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

//CLASE QUE CONSTRUYE EL MARCO PRINCIPAL------------------------------
class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
	
	setTitle("Prueva varios");
	
	setBounds(1000,100,300,200);
	
	//añadimos la lamina al marco
	
	Lamina_Principal lamina=new Lamina_Principal();
	add(lamina);
	
	}
}
//CLASE QUE CREA LA LAMINA PRINCIPAL----------------------------

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal() {
		
		/*
		 * creamos el boton que creara nuevas ventanas
		 */
		
		JButton boton_nuevo=new JButton("Nuevo");
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar");
		add(boton_cerrar);
		
		//instanciamos la clase para dar funcion al boton
		
		OyenteNuevo miOyente=new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyente);
		
		
		
		
	}
	
	/*
	 * creamos una clase interna
	 * fuera del costructor, que dara funcion al boton nuevo
	 * y le pasamos por parametro el boton de cerrar
	 */
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Marco_Emergente marco =new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
			
			
		}	
	}
	
	/*
	 * creamos la instancia de boton cerrar, fuera del constructor
	 * para usar la instancia de boton_cerrar en diferentes
	 * metodos que tendra la clase y asi poder pasarlo por parametro
	 */
	
	  JButton boton_cerrar;
}

//CLASE QUE CONSTRUYE NUEVAS VENTANAS--------------------------------

	class Marco_Emergente extends JFrame{
		
		public Marco_Emergente(JButton boton_de_principal) {//le pasamos por parametro un boton
			
			/*
			 * la variable contador, se incrementara cada vez
			 * que se llame al constructor
			 */
			
			contador++;
			
			setTitle("Ventana"+contador);	
			
			/*
			 * las nuevas ventans emergentes se deben 
			 * abrir en distintas posiciones para 
			 * que no se superpongan.
			 * la posicion debe ser variable
			 */
			
			setBounds(30*contador,30*contador,300,150);
			
			/*
			 * le decioms que el boton que recibimos por parametro
			 * es el desencadenante de la fuente
			 */
			
			CierraTodo oyentecerrar =new CierraTodo();
			boton_de_principal.addActionListener(oyentecerrar);
	
		}
		
		
		/*
		 * creamos la variable estatica contador
		 */
		
		private static int contador=0;
		
		/*
		 * creamos una clase interna que hara que se cierren 
		 * todas las ventanas al pulsar el boton cerrar
		 */
		
		private class CierraTodo implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();//metodo cierra una las ventanas
				contador=0;//ponemos el contador a cero cuando cerramos todas las ventanas
			}
			
			
		}
	}







