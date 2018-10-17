package strings;

import java.util.Scanner;

public class ejc7321 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		StringBuilder nombre = new StringBuilder(teclado.nextLine());
		
		System.out.println(nombre.reverse());
		
		teclado.close();

	}

}
