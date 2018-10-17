package strings;

import java.util.Scanner;

public class ejc7322 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		StringBuilder nombre = new StringBuilder(teclado.nextLine());
		
		if (nombre.charAt(0) == 'A') {
			nombre.setCharAt(0, 'B');
		} else {
			nombre.setCharAt(0, 'A');
		}
		System.out.println(nombre);
		
		teclado.close();

	}

}
