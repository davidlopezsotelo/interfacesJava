package swing;

import java.awt.*;

import javax.swing.*;

/*
 * diseño del layout....::::::::::::BOTONES:::::::::::::::::::...
 */

public class Layout1 {

	public static void main(String[] args) {
		
		Marco_Layout marco=new Marco_Layout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
		

	}

}

//CLASE MARCO (FRAME)----------------------------------------------------

class Marco_Layout extends JFrame{
	
	//constructor
	public Marco_Layout() {
		
		setTitle("Prueba acciones");
		
		setBounds(600,350,600,300);
		
		Panel_Layout lamina=new Panel_Layout();
		
				/*
				 * CAMBIAMOS LA DISPOSICION DE LOS BOTONES
				 
				
				FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
				
				lamina.setLayout(disposicion);//establece el layout disposicion en lamina*/
				
		
		//otra forma de establecer layout,con separacion entre botones(horizonyal,vertical)
		
		lamina.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
				
		
		add(lamina);
	}
}
//CLASE PANEL----------------------------------------------------------------

class Panel_Layout extends JPanel{
	
	
	//constructor
	public Panel_Layout() {
		
		
		add(new JButton("Amarilo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));
		
		
	}
	
}
