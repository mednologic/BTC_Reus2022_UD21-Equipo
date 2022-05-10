package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionesTest {
	
	@Test
	public void testGetTypeConverssion() {
		Funciones FuncionTest1 = new Funciones();
		double esperado = 2.1;
		assertEquals(esperado, FuncionTest1.euroDollar(2));	
		
		Funciones FuncionTest2 = new Funciones();
		double esperado2 = 141.9;
		assertEquals(esperado2, FuncionTest2.euroRubla(2));	
		
		Funciones FuncionTest3 = new Funciones();
		double esperado3 = 1.9047619047619047;
		assertEquals(esperado3, FuncionTest3.dollarEuro(2));
		
		Funciones FuncionTest4 = new Funciones();
		double esperado4 = 1.9047619047619047;
		assertEquals(esperado3, FuncionTest3.dollarRuble(2));
	}

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
		String esperado = "0";
		assertEquals(esperado, FuncionTest1.resetValue());
	}

	@Test
	public void testBackSpace() {
		Funciones FuncionTest1 = new Funciones();
		String esperado = "";
		assertEquals(esperado, FuncionTest1.backSpace(esperado));		
	}

	@Test
	public void testEuroRubla(){
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.euroRubla(2);
		double esperado = 141.9;
		assertEquals(esperado, resultado);	
	}

	@Test
	public void testEuroDollar(){
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.euroDollar(2);
		double esperado = 2.1;
		assertEquals(esperado, resultado);		
	}

	@Test
	public void testDollarEuro(){
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.dollarEuro(2);
		double esperado = 1.9047619047619047;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDollarRuble() {
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.dollarRuble(2);
		double esperado = 138.7;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRubleEuro() {
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.rubleEuro(2);
		double esperado = 142.85714285714286;		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRubleDollar() {
		Funciones FuncionTest1 = new Funciones();
		double resultado = FuncionTest1.rubleDollar(2);
		double esperado = 153.84615384615384;
		assertEquals(esperado, resultado);
	}

}

