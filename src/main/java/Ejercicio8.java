import java.util.Scanner;

public class Ejercicio8 {
	public static String[] leerNinos(Scanner scanner) {
		System.out.print("Ingrese la cantidad de ninos: ");

		int cantidad = scanner.nextInt();
		String[] enteros = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese el nino en la posicion " + i + ": ");
			enteros[i] = scanner.nextLine();
		}

		return enteros;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el numero k: ");

			int k = scanner.nextInt();

			String[] ninos = leerNinos(scanner);

			System.out.println("El nino escogido es: " + ninos[k]);
		}
	}
}
