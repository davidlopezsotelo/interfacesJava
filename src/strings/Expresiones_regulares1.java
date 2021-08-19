package strings;

public class Expresiones_regulares1 {
	
	/*
	 * VALIDAR DNI
	 */

	public static void main(String[] args) {


		System.out.println(validarDNI("34562465A"));
		System.out.println(validarDNI("345624"));
		System.out.println(validarDNI("d00562465"));
		
		
		
		

	}
	 /*
	  * metodo que evalua las coincidencias que 
	  * le pasamos por parametro
	  */
	
	public static boolean validarDNI(String DNI) {
		
		return DNI.matches("^[0-9]{8}[A-Z]{1}$");//^= inicio de cadena, $=final de cadena [caracteres a evaluar],{numero de caracteres}, ?=elemento opcional 
	}

}
