import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

	@Test
	public void testTotalSalarioEmpresa() {
		
		Empleado directores = new EmpleadoConPersonal("Juan Magliarelli", "Director", 500);
		
		Empleado gerenteA1 = new EmpleadoConPersonal("  A1", "Gerente", 300);
		directores.agregar(gerenteA1);
		
		Empleado empleadoMedioAB1 = new EmpleadoConPersonal("     AB1", "Empleado Medio", 200);
		gerenteA1.agregar(empleadoMedioAB1);
		
		Empleado empleadoMedioAC1 = new EmpleadoConPersonal("     AC1", "Empleado Medio", 200);
		gerenteA1.agregar(empleadoMedioAC1);
		
		Empleado liderProyectoABA1 = new EmpleadoConPersonal("          ABA1", "Lider de proyecto", 100);
		liderProyectoABA1.agregar(new EmpleadoRegular("ABAE1", 50));
		empleadoMedioAB1.agregar(liderProyectoABA1);
		
		Empleado liderProyectoACA1 = new EmpleadoConPersonal("          ACA1", "Lider de Proyecto", 100);
		liderProyectoACA1.agregar(new EmpleadoRegular ("ACAE1", 50));
		liderProyectoACA1.agregar(new EmpleadoRegular ("ACAE2", 50));
		liderProyectoACA1.agregar(new EmpleadoRegular ("ACAE3", 50));
		empleadoMedioAC1.agregar(liderProyectoACA1);

		int salarioTotal = directores.calcularSalarioDeEmpresa();
		
		Assert.assertEquals(1600, salarioTotal, 0.1);
	}
	
	@Test
	public void testTieneEmpleadosACargo() {
		
		EmpleadoConPersonal directores = new EmpleadoConPersonal("Juan Magliarelli", "Director", 500);
		
		EmpleadoConPersonal gerenteA1 = new EmpleadoConPersonal("  A1", "Gerente", 300);
		
		
		directores.agregar(gerenteA1);
		
		
		Assert.assertFalse(directores.tieneEmpleados());
		
	}
	

}
