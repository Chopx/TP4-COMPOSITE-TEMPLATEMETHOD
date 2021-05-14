
//		HOJA

class EmpleadoRegular extends Empleado {
	public EmpleadoRegular(String nombre, int salario) {
		super(nombre, "Empleado Regular", salario);
	}

	public void agregar(Empleado c) {
		System.out.println("no se puede agregar la hoja");
	}

	public void eliminar(Empleado c) {
		System.out.println("no se puede quitar la hoja");
	}

	public void mostrar(int depth) {
		System.out.println("		" + nombre + " | puesto: " + puesto + " | salario: " + salario);
	}

	@Override
	public int calcularSalarioDeEmpresa() {
		return salario;
	}


}
