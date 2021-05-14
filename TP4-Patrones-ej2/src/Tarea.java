
//		HOJA

class Tarea extends ItemProyecto {
	
	public Tarea(String nombre, String tipo) {
		super(nombre, tipo, 0);
	}

	public void agregar(ItemProyecto c) {
		System.out.println("no se puede agregar la hoja");
	}

	public void eliminar(ItemProyecto c) {
		System.out.println("no se puede quitar la hoja");
	}

	public void mostrar(int depth) {
		System.out.println(tipo + ": " + nombre);
	}

	@Override
	public int calcularEsfuerzoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
}
