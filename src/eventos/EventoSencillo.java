package eventos;

import java.awt.*;
import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import javax.swing.*;

public class EventoSencillo {

	public static void main(String[] args) {
		
		MarcoBotonesColores mimarco=new MarcoBotonesColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//CONSTRUIR EL MARCO:
	
 static class MarcoBotonesColores extends JFrame{
		
		public MarcoBotonesColores() {
			
			setTitle("Botones y Eventos");
			
			setBounds (700,300,500,300);
			
			LaminaColoresBotones milamina =new LaminaColoresBotones();
			
			add(milamina);
		}

		//CREAMOS EL PANEL:
		
class LaminaColoresBotones extends JPanel implements ActionListener {
	
	  //CREAMOS LOS BOTONES:
	
	JButton botonAzul=new JButton ("Azul");
	
	JButton botonRojo=new JButton ("Rojo");
	
	JButton botonVerde=new JButton ("Verde");
	
	//CONSTRUCTOR QUE AÑADE LOS BOTONES
	
	public LaminaColoresBotones() {
		
		add(botonAzul);
		
		add(botonRojo);
		
		add(botonVerde);
		
	//ACCION DE LOS BOTONES (Listener):	
		botonAzul.addActionListener(this);
		
		botonRojo.addActionListener(this);
		
		botonVerde.addActionListener(this);
			
	}

	//EVENTO, ACCION QUE REALIZAN LOS BOTONES  
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul)setBackground(Color.BLUE);
		
		else if(botonPulsado==botonRojo)setBackground(Color.RED);
		
		else setBackground(Color.GREEN);                    }}}}
