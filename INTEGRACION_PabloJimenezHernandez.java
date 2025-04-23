package Examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class INTEGRACION_PabloJimenezHernandez {

	//Prueba de integración con el método realizarPedido de la clase Instituto que une a ambas clases tanto Departamento como Instituto
	//Al devolvernos True sabremos que ambas clases están conectadas
	@Test
	void Integracion() {
		Instituto instituto = new Instituto(10);//Creamos un instituto con una capacidad de 10 departamentos 
		instituto.agregarDepartamento("Entornos", 220.00);//Creamos un departamento con el nombre Entornos y con un presupuesto de 220 dentro de ese instituto
		boolean integracion= instituto.realizarPedido("Entornos", 100);//Le añadimos el mismo nombre que el departamento que hemos creado para que lo pueda encontrar , además de un monto menor que el presupuesto para que la boleana nos devuelva true
		assertTrue(integracion , "Debe devolver verdadero ya que queremos realizar un pedido de un Departamento Existente y con un Monto Menor que el Presupuesto");
	}
	
	/*
	 Los métodos agregarDepartamentos y realizarPedido de la clase Instituto están unidos a la clase Departamento
	 ya que agregarDepartamento requiere que añadas el nombre y presupuesto de ese Departamento 
	 y se añade en un Instituto y luego con esta prueba hemos comprobado que al intentar realizar un pedido
	 de un departamento dentro de un instituto , nos ha devuelto true como que se ha realizado el pedido
	 por lo tanto ambas clases están bien integradas
	 */

}
