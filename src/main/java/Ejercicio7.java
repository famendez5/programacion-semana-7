import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la contrasena: ");

			String contrasena = scanner.nextLine();

			if (esSegura(contrasena)) {
				System.out.println("La contrasena es segura");
			} else {
				System.out.println("La contrasena no es segura");
			}
		}
	}

	private static boolean esSegura(String contrasena) {
		if (contrasena.length() < 10) {
			return false;
		}

		boolean tieneLetra = false;
		boolean tieneDigito = false;
		boolean tieneSimbolo = false;

		for (char caracter : contrasena.toCharArray()) {
			if ((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')) {
				tieneLetra = true;
				break;
			}
		}

		for (char caracter : contrasena.toCharArray()) {
			if (caracter >= '0' && caracter <= '9') {
				tieneDigito = true;
				break;
			}
		}

		for (char caracter : contrasena.toCharArray()) {
			boolean letra = (caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z');
			boolean digito = caracter >= '0' && caracter <= '9';

			if (!letra && !digito) {
				tieneSimbolo = true;
				break;
			}
		}

		return tieneLetra && tieneDigito && tieneSimbolo;
	}
}
