//		COMPONENTE
public abstract class Seguro {
	protected String nombre;
	protected String tipo;
	protected double precio;

	public Seguro(String nombre, String tipo, double precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}

	abstract public void agregar(Seguro c);

	abstract public void eliminar(Seguro c);

	abstract public void mostrar(int profundidad);
	
	abstract public double calcularPrecioTotal();
	
	abstract public int calcularCantidadDePaquetes();

	abstract public double aplicarDescuento();
	
}