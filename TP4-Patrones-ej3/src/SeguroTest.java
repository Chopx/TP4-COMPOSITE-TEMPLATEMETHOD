import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SeguroTest {

	 @Test
	 public void testCalcularPrecioPaquete() {
		
		 	Seguro paquetes = new PaqueteDeSeguros("Todos los paquetes", "Paquetes", 0);
		 
		 	Seguro paquete1 = new PaqueteDeSeguros("Paquete Básico Personal", "Combo Seguro", 0);
			
		 	paquete1.agregar(new SeguroSimple("Seguro Sancor", "Automovil", 2500));
		 	paquete1.agregar(new SeguroSimple("Seguro Haus", "Hogar", 5000));
		 	paquete1.agregar(new SeguroSimple("Seguro Live", "Vida", 1500));
		
		 	Seguro paquete2 = new PaqueteDeSeguros("Paquete Familiar", "Combo Seguro", 0);
			
		 	paquete2.agregar(new SeguroSimple("Seguro Sancor", "Vida", 1500));
		 	paquete2.agregar(new SeguroSimple("Seguro Haus", "Hogar", 5000));
		 	paquete2.agregar(new SeguroSimple("Seguro Live", "Vida", 1500));
		 	
		 	paquetes.agregar(paquete1);
		 	paquetes.agregar(paquete2);
		 	
		 	double precioTotal = paquetes.aplicarDescuento();
			System.out.println(precioTotal);
			
			
			Assert.assertEquals(precioTotal, 11900, 0.1);
			
	 }
	 
	 @Test
	 public void testCalcularSeguro() {
		SeguroSimple seguroDeVida = new SeguroSimple("Seguro Sanco", "Vida", 2500);
		
		double precioTotal = seguroDeVida.calcularPrecioTotal();
		System.out.println(precioTotal);
		
		Assert.assertEquals(precioTotal, 2500, 0.1);
	 }
		
	 
}
