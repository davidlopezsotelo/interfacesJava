package strings;

public class Espresiones_regulares2 {
	
	/*
	 * VALIDAR NUMEROS
	 */

	public static void main(String[] args) {

		System.out.println(validaNumero("100")+" 100");
		System.out.println(validaNumero("-5890")+" -5890");
		System.out.println(validaNumero("asf")+" asf");
		

	}
	
	/*
	 * metoso que evalua numeros que le pasemos
	 * por parametro
	 */
	
	public static boolean validaNumero(String texto) {
		
		return texto.matches("^-?[0-9]+$");// -? = negativo opcional, + = como minimo uno (indeterminado)
	}

}
//github no sube

