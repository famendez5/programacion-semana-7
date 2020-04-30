import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un palabra: ");

			String palabra = scanner.nextLine();

			if (esPalindromo(palabra)) {
				System.out.println("La palabra es un palindromo");
			} else {
				System.out.println("La palabra no es un palindromo");
			}

		}
	}

	public static boolean esPalindromo(String palabra) {
		if (palabra.length() % 2 == 0) {
			return false;
		}

		int limite = palabra.length() / 2;

		for (int i = 0; i < limite; i++) {
			int j = palabra.length() - i - 1;
			if (palabra.charAt(i) != palabra.charAt(j)) {
				return false;
			}
		}

		return true;
	}
}
