package ar.unrn.test;

import ar.unrn.modelo.*;

import org.junit.Assert;
import org.junit.Test;

public class PrecioRemerasTest {

	@Test
	public void testRemeraImportada() {

		Remera remeraImportada = new RemeraImportada(100);

		double resultado = remeraImportada.calcularPrecio();
		System.out.println("RemeraImportada " + resultado);
		Assert.assertEquals(133.0, resultado, 0.01);

	}

	@Test
	public void testRemeraNacional() {
		
		Remera remeraNacional = new RemeraNacional(100);

		double resultado = remeraNacional.calcularPrecio();
		System.out.println("RemeraNacional " + resultado);
		Assert.assertEquals(136.5, resultado, 0.01);

	}

}
