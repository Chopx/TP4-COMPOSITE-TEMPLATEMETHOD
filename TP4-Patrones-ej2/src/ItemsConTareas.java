import java.util.ArrayList;

// 		COMPUESTO

class ItemsConTareas extends ItemProyecto {
	private ArrayList<ItemProyecto> listaTareas = new ArrayList<ItemProyecto>();

	public ItemsConTareas(String nombre, String tipo, int puntosEsfuerzo) {
		super(nombre, tipo, puntosEsfuerzo);
	}

	@Override
	public void agregar(ItemProyecto componente) {
		listaTareas.add(componente);
	}

	@Override
	public void eliminar(ItemProyecto componente) {
		listaTareas.remove(componente);
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(tipo + ": " +nombre + " nivel: " + profundidad);
		for (ItemProyecto itemProyecto : listaTareas) {
			itemProyecto.mostrar(profundidad + 1);
		}
	}

	@Override
	public int calcularEsfuerzoTotal() {
		int monto = this.puntosEsfuerzo;
		for (ItemProyecto itemProyecto : listaTareas) {
			monto += itemProyecto.calcularEsfuerzoTotal();
		}
		return monto;
	}
	
	
	
	
	
	
}
