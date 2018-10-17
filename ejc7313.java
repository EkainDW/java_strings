package strings;

import java.util.Scanner;

public class ejc7313 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		
		for (int i=nombre.length()-1 ; i>=0 ; i--) {
			System.out.print(nombre.charAt(i));
		}
		
		teclado.close();
		
	}

}
