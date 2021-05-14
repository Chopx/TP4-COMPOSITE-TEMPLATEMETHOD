
//		COMPONENTE

public abstract class Empleado {
	protected String nombre;
	protected String puesto;
	protected int salario;

	public Empleado(String nombre, String puesto, int salario) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}

	abstract public int calcularSalarioDeEmpresa();

	abstract public void agregar(Empleado c);

	abstract public void eliminar(Empleado c);

	abstract public void mostrar(int profundidad);

}