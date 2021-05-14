package ar.unrn.test;
import ar.unrn.modelo.*;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;


public class CalculadorTest {

	@Test
	public void testJubiladoSinPromocion() {
		
		CalculadorMethod calculador = new CalculadorJubiladoMethod(LocalDateTime.now().getMonthValue()-1);
		
		double resultado = calculador.calcularPrecio(100);
		System.out.println(resultado);
		Assert.assertEquals(110d, resultado, 0.01f);	
		
	}
	
	@Test
	public void testJubiladoConPromocion() {
		
		CalculadorMethod calculador = new CalculadorJubiladoMethod(LocalDateTime.now().getMonthValue());
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(100d, resultado, 0.01f);
		
	}

	@Test
	public void testNoJubiladoConPromocion() {
		
		CalculadorMethod calculador = new CalculadorNoJubiladoMethod(LocalDateTime.now().getMonthValue());
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(115d, resultado, 0.01f);
		
	}
	
	@Test
	public void testNoJubiladoSinPromocion() {
		
		CalculadorMethod calculador = new CalculadorNoJubiladoMethod(LocalDateTime.now().getMonthValue()-1);
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(121d, resultado, 0.01f);
	}
	
}
