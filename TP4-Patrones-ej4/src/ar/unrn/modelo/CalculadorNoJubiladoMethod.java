package ar.unrn.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;


public class CalculadorNoJubiladoMethod extends CalculadorMethod {

	public CalculadorNoJubiladoMethod(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return (precioProducto * 0.15) + precioProducto;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return (precioProducto * 0.21) + precioProducto;
	}

	

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (of(this.mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.15;
//		} else {
//			precioTotal += precioProducto * 0.21;
//		}
//		//log.log(CalculadorNoJubilado.class.getName());
//		return precioTotal;
//	}

}
