package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionesTest {

	@Test
	public void testTipoMoneda() {
		Funciones FuncionTest1 = new Funciones();
		String esperado = "Euro";
		assertEquals(esperado, FuncionTest1.tipoMoneda(1));

		Funciones FuncionTest2 = new Funciones();
		String esperado2 = "Rubla";
		assertEquals(esperado2, FuncionTest2.tipoMoneda(2));

		Funciones FuncionTest3 = new Funciones();
		String esperado3 = "Dollar";
		assertEquals(esperado3, FuncionTest3.tipoMoneda(3));
	}

	@Test
	public void testResetValue() {
		Funciones FuncionTest1 = new Funciones();
		double esperado = 0;
		assertEquals(esperado, FuncionTest1.resetValue());		
	}

	@Test
	public void testeuroRubla(){
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.euroRubla(2);
		double esperado = 141.9;
		assertEquals(esperado, resultado);	
	}

	@Test
	public void testeuroDollar(){{
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.euroDollar(2);
		double esperado = 2.1;
		assertEquals(esperado, resultado);		
	}

	}
}
