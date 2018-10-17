package strings;

import java.util.Scanner;

public class ejc7323 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		StringBuilder nombre = new StringBuilder(teclado.nextLine());
		
		System.out.println("Don " + nombre);
		System.out.println(nombre.insert(0, "Don "));
		
		teclado.close();

	}

}
