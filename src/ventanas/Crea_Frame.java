package ventanas;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class Crea_Frame {

	public static void main(String[] args) {

			//INSTANCIAMOS LA CLASE PROPIA miFrame:
		
		miFrame marco1=new miFrame();
		
			//HACEMOS VISIBLE EL FRAME:
		
		marco1.setVisible(true);
		
			//INDICAMOS QUE DEVE HACER AL CERRARSE:
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


// CREAMOS UNA CLASE PARA CREAR EL FRAME (marco)----------------------------------
/*
 *    Otorgando propiedades que necesitamos utilizando
 *     los metodos apropiados de la clase JFrame
 */
 

class miFrame extends JFrame{
	
	public miFrame() {	//constructor de la clase
		
			//ESTABLECER LA UBICACION Y EL TAMAÑO
		
		setBounds(500,300,500,250);
		
			//AÑADIR TITULO A LA VENTANA
		
		setTitle("mi ventana");
		
			//cambiar icono ventana
		
		/*
		 * usamos la clase ToolKit
		 * para comunicarnos con los archivos del sistema 
		 * nativo de ventanas
		 */
		
			//creamos un objeto toolkit
		
		Toolkit miSistema=Toolkit.getDefaultToolkit();
		
			/*
			 * creamos el objeto image, que usará el objeto toolkit
			 * para establecer una imagen de icono
			 */
		
		Image miIcono=miSistema.getImage("logobar.gif");
		
		setIconImage(miIcono);
		
		//todo

		
	}
}