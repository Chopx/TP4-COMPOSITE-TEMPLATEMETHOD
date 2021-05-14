
//		HOJA

class SeguroSimple extends Seguro {
	
	public SeguroSimple(String nombre, String tipo, double precio) {
		super(nombre, tipo, precio);
	}

	public void agregar(Seguro c) {
		System.out.println("no se puede agregar la hoja");
	}

	public void eliminar(Seguro c) {
		System.out.println("no se puede quitar la hoja");
	}

	public void mostrar(int depth) {
		System.out.println(tipo + ": " + nombre);
	}

	@Override
	public double calcularPrecioTotal() {
		return precio;
	}

	@Override
	public int calcularCantidadDePaquetes() {
		return 1;
	}

	@Override
	public double aplicarDescuento() {
		return 0;
	}

	

	
	

	
}
