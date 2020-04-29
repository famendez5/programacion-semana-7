import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] enteros = Ejercicio1.leerEnteros(scanner);

			int diferentes = cuantosDiferentes(enteros);

			System.out.println("Hay " + diferentes + " enteros diferentes");
		}
	}

	public static int cuantosDiferentes(int[] arreglo) {
		int diferentes = 0;

		for (int i = 0; i < arreglo.length; i++) {
			boolean diferente = true;

			for (int j = 0; j < i; j++) {
				if (arreglo[i] == arreglo[j]) {
					diferente = false;
					break;
				}
			}

			if (diferente) {
				diferentes++;
			}
		}

		return diferentes;
	}
}
