package strings;

import java.util.Scanner;

public class ejc7314 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();

		System.out.print(nombre.toUpperCase().charAt(0)+nombre.toLowerCase().substring(1, nombre.length()));
		
		teclado.close();
		
	}

}
