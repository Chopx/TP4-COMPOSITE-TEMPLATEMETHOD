import java.util.ArrayList;

//		COMPUESTO

class EmpleadoConPersonal extends Empleado {
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

	public EmpleadoConPersonal(String name, String puesto, int salario) {
		super(name, puesto, salario);
	}

	@Override
	public int calcularSalarioDeEmpresa() {
		int monto = this.salario;
		for (Empleado empleado : listaEmpleados) {
			monto += empleado.calcularSalarioDeEmpresa();
		}
		return monto;
	}

	@Override
	public void agregar(Empleado componente) {
		listaEmpleados.add(componente);
	}

	@Override
	public void eliminar(Empleado componente) {
		listaEmpleados.remove(componente);
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(nombre + " | puesto: " + puesto + " | nivel: " + profundidad + " | salario: " + salario);
		for (Empleado empleado : listaEmpleados) {
			empleado.mostrar(profundidad + 1);
		}
	}
	
	

	public boolean tieneEmpleados() {
		return listaEmpleados.isEmpty(); 
	}

}
