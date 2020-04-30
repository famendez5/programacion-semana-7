import java.util.Scanner;

public class Ejercicio4 {
	public static float[] leerReales(Scanner scanner) {
		System.out.print("Ingrese la cantidad de numeros reales: ");

		int cantidad = scanner.nextInt();
		float[] enteros = new float[cantidad];  

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese el numero real de la posicion " + i + ": ");
			enteros[i] = scanner.nextFloat();
		}

		return enteros;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			float[] reales = leerReales(scanner);
			float media = mediana(reales);
			System.out.println("La mediana es: " + media);
		}
	}

	public static float mediana(float[] arreglo) {
		float suma = 0;

		for (int i = 0; i < arreglo.length; i++) {
			suma = suma + arreglo[i];
		}

		return suma / arreglo.length;
	}
}
