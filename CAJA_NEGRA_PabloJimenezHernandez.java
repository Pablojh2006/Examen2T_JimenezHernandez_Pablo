package Examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CAJA_NEGRA_PabloJimenezHernandez {

	//Pruebas de Límite sobre el método procesarPedido de la clase Departamento
	
	//Monto mayor que el presupuesto en el límite 
	@Test
	void montoMayorLimite() {
		Departamento departamentoCajaNegra = new Departamento ("Departamento1" , 300.00);//Creamos un departamento con el presupuesto de 300
		boolean pruebaDepartamento = departamentoCajaNegra.procesarPedido(300.01);//El monto es Mayor que el presupuesto por lo que la variable debe devolver false
		assertFalse(pruebaDepartamento,"Esto deberia de ser false porque el monto es mayor que el presupuesto");
	}
	
	//Monto igual que el presupuesto 
	@Test
	void montoIgual() {
		Departamento departamentoCajaNegra = new Departamento ("Departamento1" , 300.00);//Creamos un departamento con el presupuesto de 300
		boolean pruebaDepartamento = departamentoCajaNegra.procesarPedido(300.00);//El monto es igual que el presupuesto por lo que la variable debe devolver true
		assertTrue(pruebaDepartamento,"Esto deberia de ser true porque el monto es igual que el presupuesto");
	}
	
	//Monto menor que el presupuesto en el Límite
	@Test
	void montoMenorLimite() {
		Departamento departamentoCajaNegra = new Departamento ("Departamento1" , 300.00);//Creamos un departamento con el presupuesto de 300
		boolean pruebaDepartamento = departamentoCajaNegra.procesarPedido(299.99);//El monto es menor que el presupuesto por lo que la variable debe devolver true
		assertTrue(pruebaDepartamento,"Esto deberia de ser true porque el monto es menor que el presupuesto");
	}
	
	//.......................................................................................
	//.......................................................................................
	
	

	
	

}
