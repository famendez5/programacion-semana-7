import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la primera palabra: ");

			String palabra1 = scanner.nextLine();
			
			System.out.print("Ingrese la segunda palabra: ");

			String palabra2 = scanner.nextLine();

			if (esAnagrama(palabra1, palabra2)) {
				System.out.println("La palabra " + palabra1 + " es anagrama de la palabra " + palabra2);
			} else {
				System.out.println("La palabra " + palabra1 + " no es anagrama de la palabra " + palabra2);
			}
		}
	}

	private static int caracterEnPalabra(String palabra, char caracter) {
		int i = 0;

		for (char c : palabra.toCharArray()) {
			if (c == caracter) {
				i += 1;
			}
		}

		return i;
	}

	private static boolean esAnagrama(String palabra1, String palabra2) {
		for (char caracter : palabra1.toCharArray()) {
			int i = caracterEnPalabra(palabra1, caracter);
			int j = caracterEnPalabra(palabra2, caracter);

			if (i != j) {
				return false;
			}
		}

		return true;
	}
}
