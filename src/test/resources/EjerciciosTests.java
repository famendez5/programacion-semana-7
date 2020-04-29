import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EjerciciosTests {

	@Test
	void testBuscarEnArreglo() {
		assertEquals(-1, Ejercicio1.buscarEnArreglo(new int[] { 1, 2, 3 }, 5));
		assertEquals(0, Ejercicio1.buscarEnArreglo(new int[] { 1, 2, 3 }, 1));
		assertEquals(1, Ejercicio1.buscarEnArreglo(new int[] { 1, 2, 3 }, 2));
		assertEquals(2, Ejercicio1.buscarEnArreglo(new int[] { 1, 2, 3 }, 3));
	}

	@Test
	void testEstaOrdenado() {
		assertTrue(Ejercicio2.estaOrdenado(new int[] { 1, 2, 3 }));
		assertFalse(Ejercicio2.estaOrdenado(new int[] { 3, 2, 1 }));
		assertFalse(Ejercicio2.estaOrdenado(new int[] { 1, 2, 0 }));
		assertTrue(Ejercicio2.estaOrdenado(new int[] { 3, 6, 9 }));
	}
}
