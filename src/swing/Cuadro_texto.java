package swing;

import java.awt.event.*;

import javax.swing.*;

/*
 * VENTANA EN LA QUE TENEMOS UN CUADRO PARA PODER ESCRIBIR.
 * Y COMPROBAR UN EMAIL VALIDO
 */

public class Cuadro_texto {

	public static void main(String[] args) {
		
		MarcoTexto mimarco=new MarcoTexto();//construimos Frame
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

//CLASE FRAME--------------------------------------------------------------------------------
class MarcoTexto extends JFrame {
	
	//constructor

	
	public MarcoTexto() {
		
		setBounds(600,300,600,350);
		
		LaminaTexto milamina=new LaminaTexto();//construimos el Panel
		
		add(milamina);
		
		setVisible(true);
		
	}	
}
//CLASE PANEL-----------------------------------------------------------------------------
class LaminaTexto extends JPanel{
	
	/*
	 * clase en la que se agregan los componentes swing
	 */
	
	
	
	  private JTextField campo1;//lo creamos fuera para que tenga ambito de clase

	  private JLabel resultado;
	
	//constructor
	
	  public LaminaTexto() {
		  
		  
		  /*
		   * Creamos etiqueta en ventana
		   */
		  
		  JLabel texto1 =new JLabel("Email:");
		  add(texto1);
		  
		  
		  campo1= new JTextField(20);//cuadro de texto en ventana (ancho del cuadro, o texto por defecto)
		  add(campo1);
		  
		  /*
		   * capturamos el texto escrito por el usuario
		   */
		  
		  //creamos un boton
		  
		  JButton boton1=new JButton("VALIDAR");
		  
		  //objeto de la clase que gestiona el evento
		  
		  DameTexto mievento=new DameTexto();
		  
		  //ponemos el boton a la escucha
		  
		  boton1.addActionListener(mievento); 	  
		  add (boton1);
		  
		  //texto valido o no valido
		  
		  resultado=new JLabel();
		  
		  add(resultado);
		  
		  
	  }
	  
	  
	//CLASE INTERNA QUE GESTIONA EL EVENTO DE BOTON----------------------------------------------------------
	  
	 private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 * codigo para validar un email
			 */
			
			int correcto=0;//numero de @,
			
			String  email=campo1.getText().trim();// variable donde evaluamos el texto. trim, elimina espacios al principio y al final
			
			
			/*
			 * evaluamos todos los caracteres
			 * del texto introducido
			 */
			
			for(int i=0;i<email.length();i++) {
				
				//evaluamos los caracterers
				
				if(email.charAt(i)=='@') {
					correcto++;
				}

			}
			
			if(correcto!=1) {
				
				
			for(int j=0;j<email.length();j++) {
				if(email.charAt(j)=='.') {
					resultado.setText("incorrecto");
					
				}
				
				
			}
				
				
				
			}else {
				resultado.setText("correcto");
			}
			
			
			
			/*
			 * 
			 * 
			 * pendiente evaluar  punto 
			 * 
			 * y que no este al principio o al final
			 * 
			 */
			
			/*
			 * mensaje de texto
			 */
			
			
		}
		 
	 }

}

