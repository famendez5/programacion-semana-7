import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] enteros = Ejercicio1.leerEnteros(scanner);

			if (estaOrdenado(enteros)) {
				System.out.println("El arreglo de enteros esta ordenado");
			} else {
				System.out.println("El arreglo de enteros no esta ordenado");
			}
		}
	}

	public static boolean estaOrdenado(int[] arreglo) {
		if (arreglo.length <= 1) {
			return true;
		}

		int temp = arreglo[0];

		for (int entero: arreglo) {
			if (entero >= temp) {
				temp = entero;
			} else {
				return false;
			}
		}

		return true;
	}
}
