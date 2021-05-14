//		COMPONENTE
public abstract class ItemProyecto {
	protected String nombre;
	protected String tipo;
	protected int puntosEsfuerzo;

	public ItemProyecto(String nombre, String tipo, int puntosEsfuerzo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntosEsfuerzo = puntosEsfuerzo;
	}

	abstract public void agregar(ItemProyecto c);

	abstract public void eliminar(ItemProyecto c);

	abstract public void mostrar(int profundidad);
	
	abstract public int calcularEsfuerzoTotal();
	
}