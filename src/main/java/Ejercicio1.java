import java.util.Scanner;

public class Ejercicio1 {
	static int[] leerEnteros(Scanner scanner) {
		System.out.print("Ingrese la cantidad de enteros: ");

		int cantidad = scanner.nextInt();
		int[] enteros = new int[cantidad];  

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese el entero de la posicion " + i + ": ");
			enteros[i] = scanner.nextInt();
		}

		return enteros;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] enteros = leerEnteros(scanner);

			System.out.print("Ingrese el numero a buscar: ");
			int numero = scanner.nextInt();

			int posicion = buscarEnArreglo(enteros, numero);

			if (posicion == -1) {
				System.out.println("El numero no se encuentra en el arreglo");
			} else {
				System.out.println("El numero se encuentra en la posicion " + posicion  + " del arreglo");
			}
		}
	}

	public static int buscarEnArreglo(int[] enteros, int numero) {
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] == numero) {
				return i;
			}
		}

		return -1;
	}
}
