import java.util.ArrayList;

// 		COMPUESTO

class PaqueteDeSeguros extends Seguro {
	private ArrayList<Seguro> listaSeguros = new ArrayList<Seguro>();

	public PaqueteDeSeguros(String nombre, String tipo, double precio) {
		super(nombre, tipo, precio);
	}

	@Override
	public void agregar(Seguro componente) {
		listaSeguros.add(componente);
	}

	@Override
	public void eliminar(Seguro componente) {
		listaSeguros.remove(componente);
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(tipo + ": " +nombre + " nivel: " + profundidad);
		for (Seguro seguro : listaSeguros) {
			seguro.mostrar(profundidad + 1);
		}	
	}

	@Override
	public double calcularPrecioTotal() {
		double monto = this.precio;	
		for (Seguro seguro : listaSeguros) {
			monto += seguro.calcularPrecioTotal();
		}
		return monto;
	}
	
	@Override
	public int calcularCantidadDePaquetes() {
		int total = 0;
		for (Seguro seguro : listaSeguros) {
			total += seguro.calcularCantidadDePaquetes();
		}

		return total;
		
	}
	
	@Override
	public double aplicarDescuento() {
		int descuentoTotal = calcularCantidadDePaquetes() * 5;
		double descuento = (calcularPrecioTotal() * descuentoTotal) / 100;
		return calcularPrecioTotal() - descuento;
	}
	
	
	
}
