package strings;

import java.util.Scanner;

public class ejc7315 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		nombre = nombre.toLowerCase();
		
		while (!nombre.equals("ekain")) {
			System.out.print("ERROR: Escribe tu nombre: ");
			nombre = teclado.nextLine();
		}
		
		System.out.print("Saludos, ADIOS!");
		
		teclado.close();
		
	}

}
