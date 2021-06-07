package practica1;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class Procesador {

	public static void main(String[] args) {

		MenuProcesador mimarco=new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

//CLASE PARA CREAR EL MARCO:

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(500,300,550,400);
		
		LaminaProcesador milamina=new LaminaProcesador ();
		
		add(milamina);
		
		setVisible(true);
	}
}

//CLASE PARA CREAR LA LAMINA:

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		//creamos barra de menu
		
		JMenuBar mibarra=new JMenuBar();
		
		
		// creamos elementos principales de menu----------------------------------
		
		 fuente=new JMenu("Fuente");
		
		 estilo=new JMenu("Estilo");
		
		 tamagno=new JMenu("Tama�o");
		//-----------------------------------------------------------------------
		
		// a�adimos los elementos a la barra de menu principal:------------------
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		//----------------------------------------------------------------------
		
		//Agregamos elementos del menu fuente, usando el metodo creado:
		
		configura_menu("Arial","fuente","Arial",9,10);
		configura_menu("Courier","fuente","Courier",9,10);
		configura_menu("Verdana","fuente","Verdana",9,10);
		
		//---------------------------------------------------------------------
		
		//Agregamos los elementos del menu estilo:
		
		configura_menu("Negrita","estilo","",Font.BOLD,12);
		configura_menu("Cursiva","estilo","",Font.ITALIC,12);		
		
		//---------------------------------------------------------------------
		
		// Agregamos los elementos del menu tama�o:
		
		configura_menu("12","tama�o","",9,12);
		configura_menu("16","tama�o","",9,16);		
		configura_menu("20","tama�o","",9,20);		
		configura_menu("24","tama�o","",9,24);
		configura_menu("28","tama�o","",9,28);
		configura_menu("32","tama�o","",9,32);
		configura_menu("36","tama�o","",9,36);
		configura_menu("40","tama�o","",9,40);
		configura_menu("50","tama�o","",9,50);
		//---------------------------------------------------------------------
		
		
		// agregamos la barra de menu a la lamina:
		
		laminamenu.add(mibarra);
		
		//colocamos la lamina en la posicion deseada:
		
		add(laminamenu,BorderLayout.NORTH);

		//---------------------------------------------------------------------
		
		// construimos y agregamos un objeto de tipo JTextPane para poder 
		// escribir en la lamina
		
		 miarea=new JTextPane();//declarar variable miarea fuera del constructor para que tenga ambito general.

		add(miarea,BorderLayout.CENTER);
		
	}
	
	//CREACION DE METODO PARA SELECCIONAR LOS DIFERENTES ESTILOS, FUENTES Y TAMA�OS:
	
	public void configura_menu(String rotulo,String menu,String tipo_letra,int estilos,int tam) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			
			fuente.add(elem_menu);
			
/*		ponemos el objeto a la escucha utilizando el metodo ItalicAction
		de la clase StyledEditorKit.
				 
	
	 para modificar el tipo de fuente del texto seleccionado:		  */	
			
			if(tipo_letra=="Arial") {
			
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			
			}else if(tipo_letra=="Courier") {
				
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			
			}else if(tipo_letra=="Verdana") {
				
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "verdana"));
			}
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			
/*		ponemos el objeto a la escucha utilizando el metodo ItalicAction
		 de la clase StyledEditorKit.
			 
			 para modificar el estilo del texto seleccionado:		  */	
			
			if(estilos==Font.BOLD) {
			
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos==Font.ITALIC) {
				
			elem_menu.addActionListener(new StyledEditorKit.ItalicAction());

			}
			
	//ademas este metodo permite des-seleccionar el estilo.
			
			
		}else if(menu=="tama�o") {
			
			tamagno.add(elem_menu);
			
/*		ponemos el objeto a la escucha utilizando el metodo FontSizeAction
		 de la clase StyledEditorKit.
		 
		 para modificar el tama�o de la parte eleccionada del texto:		  */
			
	   elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tama�o",tam));
			
			
		}
	}
	

//declarar variables  fuera del constructor para que tengan ambito general.
	
	JTextPane miarea;	
	JMenu fuente, estilo, tamagno;
	Font letras;
}
