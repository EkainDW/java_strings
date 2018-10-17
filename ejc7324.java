package strings;

import java.util.Scanner;

public class ejc7324 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		String nombre = new String(teclado.nextLine());
		
		nombre.toLowerCase();
		StringBuilder nombre2 = new StringBuilder(nombre);
		for (int i=0 ; i<=nombre.length()-1 ; i = i+2) {
			nombre2.insert(i, nombre.toUpperCase().charAt(i));
		}
		System.out.print(nombre2);
		
		teclado.close();

	}

}
