package ar.unrn.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class CalculadorMethod {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorMethod(int mesEnPromocion) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal = this.mesConPromocion(precioProducto);
		} else {
			precioTotal = this.mesSinPromocion(precioProducto);
		}
		//log.log(this.class.getName());
		return precioTotal;
	}

	protected abstract double mesConPromocion(double precioProducto);
	
	protected abstract double mesSinPromocion(double precioProducto);

	
}
