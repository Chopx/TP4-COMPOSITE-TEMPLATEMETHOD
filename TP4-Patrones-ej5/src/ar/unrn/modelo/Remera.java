package ar.unrn.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Remera {

	private double precio;

	public Remera(int precioRemera) {
		this.precio = precioRemera;
	}

	public double calcularPrecio() {
		double precioTotal = 0;	
		precioTotal = this.precio + this.recargoBonificacion(this.precio) + this.recargoImportadas(this.precio)
				+ this.recargoImpuestoAduanero(this.precio) + this.recargoPrecioFinal(this.precio) + this.recargoTransporte(this.precio);
		return precioTotal;
	}

	protected abstract double recargoPrecioFinal(double precioRemera);

	protected abstract double recargoImpuestoAduanero(double precioRemera);

	protected abstract double recargoImportadas(double precioRemera);

	protected abstract double recargoTransporte(double precioRemera);

	protected abstract double recargoBonificacion(double precioRemera);

}
