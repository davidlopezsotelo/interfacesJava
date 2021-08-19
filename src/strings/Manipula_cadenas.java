package strings;

public class Manipula_cadenas {

	public static void main(String[] args) {
		
		//cadena que almacena caracteres
		
		String nombre="David";
		
		//imprimir cadena
		
		System.out.println("El nombre introducido es "+nombre);
		
		//longitud de la cadena
		
		System.out.println("El nombre tiene "+nombre.length()+" letras");
		
		//devuelve la primera letra de la cadena
		
		System.out.println("La primera letra es "+nombre.charAt(0));
		
		//devuelve la ultima letra.
		
		int ultima_letra;
		
		ultima_letra=nombre.length();//variable donde guardamos la longitud de la cadena
		
				/*
				 * restarle 1 para que no exceda de la cadena, ya que esta empieza en 0
				 * si no dara una excepcion IndexBoundsEXception
				 */
		
		System.out.println("La ultima letra es "+nombre.charAt(ultima_letra-1));
		
		
		
		

		
		
		
		
	}

}
