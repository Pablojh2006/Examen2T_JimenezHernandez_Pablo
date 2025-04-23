package Examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CAJA_BLANCA_PabloJimenezHernandez {

	//Pruebas de Cobertura de Decisiones sobre el metodo procesarPedido de la clase Departamento 
	
	//Primer IF
	@Test
	void montoMayor() {//El monto será mayor que el presupuesto ,debe devolver false
		Departamento departamentoMontoMayor = new Departamento ("Departamento1" , 300);//Creamos un departamento, el presupuesto que ponemos es de 300
		boolean montoMayor = departamentoMontoMayor.procesarPedido(400);//Creamos una variable que devolverá true o false según el Monto si es Mayor o Menor que el presupuesto, en este caso ponemos el Monto mayor  
		assertFalse(montoMayor,"Esto deberia de ser false porque el monto es mayor que el presupuesto");//Debe devolver False
	}
	
	//Probamos el Else
	@Test
	void montoMenor() {
		Departamento departamentomontoMenor = new Departamento ("Departamento1" , 300);//El presupuesto que ponemos es de 300
		boolean montoMenor= departamentomontoMenor.procesarPedido(200);//Creamos una variable que devolverá true o false según el Monto si es Mayor o Menor que el presupuesto, en este caso ponemos el Monto menor   
		assertTrue(montoMenor,"Esto deberia de ser true porque el monto es menor que el presupuesto");//Debe devolver True
	}

	
	//Pruebas de Cobertura de Sentencias spbre el método realizarPedido de la clase Instituto
	
	//No existe el Departamento
	@Test
	void realizarPedidosSinDepartamentos() {
		Instituto instituto = new Instituto(5);//El instituto tendrá una capacidad de 5 departamentos , 
		instituto.agregarDepartamento("DepartamentoEntornos", 100);//Creamos un departamento dentro del Instituto con 100 de presupuesto 
		boolean buscarInstituto=instituto.realizarPedido("Departamento de futbol", 50.00);//Realizamos un pedido de un Departamento que no existe por lo que nos debe de devolver false
		assertFalse(buscarInstituto, "No existe el Departamento");
	}
	
	
	//El monto es mayor que el presupuesto
	@Test
	void realizarPedidosConMontoMayor() {
		Instituto instituto = new Instituto(5);//El instituto tendrá una capacidad de 5 departamentos , 
		instituto.agregarDepartamento("DepartamentoEntornos", 100);//Creamos un departamento dentro del Instituto con 100 de presupuesto 
		boolean institutoConMontoSuperior=instituto.realizarPedido("DepartamentoEntornos", 150.00);//Realizamos un pedido del Departamento pero con un monto superior al presupuesto lo que nos debe de devolver false
		assertFalse(institutoConMontoSuperior, "El departamento es encontrado pero el monto es superior");
	}
	
	@Test
	//Todo es correcto el monto es menor que el presupuesto y el departamento se encuentra dentro del Instituto
	void realizarPedidoCorrecto () {
		Instituto instituto = new Instituto(10);//Creamos un instituto con una capacidad de 10 departamentos 
		instituto.agregarDepartamento("Entornos", 220.00);//Creamos un departamento con el nombre Entornos y con un presupuesto de 220 dentro de ese instituto
		boolean integracion= instituto.realizarPedido("Entornos", 100);//Le añadimos el mismo nombre que el departamento que hemos creado para que lo pueda encontrar , además de un monto menor que el presupuesto para que la boleana nos devuelva true
		assertTrue(integracion , "Debe devolver verdadero ya que queremos realizar un pedido de un Departamento Existente y con un Monto Menor que el Presupuesto");
	}
}
