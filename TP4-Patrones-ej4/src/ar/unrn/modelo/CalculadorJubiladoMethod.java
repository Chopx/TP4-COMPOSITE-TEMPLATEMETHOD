package ar.unrn.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;


public class CalculadorJubiladoMethod extends CalculadorMethod {

	public CalculadorJubiladoMethod(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return precioProducto;
	}

	

	
	@Override
	protected double mesSinPromocion(double precioProducto) {
		return (precioProducto * 0.1) + precioProducto;
				
	}

	

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (!of(this.mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.1;
//		}
//		//log.log(CalculadorJubilado.class.getName());
//		return precioTotal;
//	}

}
