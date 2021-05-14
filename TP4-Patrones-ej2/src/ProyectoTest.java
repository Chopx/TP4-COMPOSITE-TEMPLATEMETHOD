import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class ProyectoTest {

	 @Test
	 public void testCalcularEsfuerzoTotalProyecto() {
		 	ItemProyecto SCRUM = new ItemsConTareas("Proyecto secretaria de Trabajo", "Proyecto", 0);
			
			ItemProyecto HU1 = new ItemsConTareas("Registrar persona", "Historia de usuario", 5);
			
			HU1.agregar(new Tarea("Ingresar nombre", "Tarea"));
			HU1.agregar(new Tarea("Ingresar apellido", "Tarea"));			//Entiendo por tiempo en Scrum 
			HU1.agregar(new Tarea("Ingresar DNI", "Tarea"));				//medido por el tiempo de esfuerzo de cada historia
			
			SCRUM.agregar(HU1);
			
			ItemProyecto HU2 = new ItemsConTareas("Actualizar persona", "Historia de usuario", 2);
			
			HU2.agregar(new Tarea("Actualizar nombre", "Tarea"));
			HU2.agregar(new Tarea("Actualizar apellido", "Tarea"));
			HU2.agregar(new Tarea("Actualizar DNI", "Tarea"));
			
			SCRUM.agregar(HU2);
			
			ItemProyecto HU3 = new ItemsConTareas("Eliminar persona", "Historia de usuario", 3);
			
			HU3.agregar(new Tarea("Ingresar DNI", "Tarea"));
			HU3.agregar(new Tarea("Eliminar persona", "Tarea"));
			
			SCRUM.agregar(HU3);
			
			ItemProyecto HU4 = new ItemsConTareas("Buscar persona", "Historia de usuario", 1);
			
			HU4.agregar(new Tarea("Ingresar DNI", "Tarea"));
			HU4.agregar(new Tarea("Tarea: Mostrar datos persona", "Tarea"));
			
			SCRUM.agregar(HU4);
			
			
			int esfuerzoTotalProyecto = SCRUM.calcularEsfuerzoTotal();
			
		
			
			Assert.assertEquals(esfuerzoTotalProyecto, 11, 0.1);
			
	 }
	 
	 
	 @Test
	 public void testCalcularEsfuerzoTotalDeUnaHistoriaDeUsuario() {
		 	ItemProyecto SCRUM = new ItemsConTareas("Proyecto secretaria de Trabajo", "Proyecto", 0);
			
			ItemProyecto HU1 = new ItemsConTareas("Registrar persona", "Historia de usuario", 5);
			
			HU1.agregar(new Tarea("Ingresar nombre", "Tarea"));
			HU1.agregar(new Tarea("Ingresar apellido", "Tarea"));		//Entiendo por tiempo en Scrum 
			HU1.agregar(new Tarea("Ingresar DNI", "Tarea"));			//medido por el tiempo de esfuerzo de cada historia
			
			SCRUM.agregar(HU1);
			
			
			int esfuerzoTotalProyecto = HU1.calcularEsfuerzoTotal();
			
			
			Assert.assertEquals(esfuerzoTotalProyecto, 5, 0.1);
			
	 }
}
