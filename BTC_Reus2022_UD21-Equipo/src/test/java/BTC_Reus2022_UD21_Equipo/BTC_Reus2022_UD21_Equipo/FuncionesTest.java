package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionesTest {
	
	Funciones FuncionTest1 = new Funciones();
	private static final double DELTA = 0.5d;
	
	// Se comprueban las funciones
	
	@Test
	public void testGetTypeConverssionEuroToDolar() {		
		String esperado = "1.05";
		String resultado =  FuncionTest1.getTypeConversion("euro", "dolar", "1");
		assertEquals(esperado, resultado);	
	}
	@Test
	public void testGetTypeConverssionEuroToRubla() {		
		String esperado = "70.95";
		String resultado =  FuncionTest1.getTypeConversion("euro", "rubla", "1");
		assertEquals(esperado, resultado);	
	}
	@Test
	public void testGetTypeConverssionDolarToEuro() {		
		String esperado = "0.9523809523809523";
		String resultado =  FuncionTest1.getTypeConversion("dolar", "euro", "1");
		assertEquals(esperado, resultado);	
	}
	@Test
	public void testGetTypeConverssionDolarToRubla() {		
		String esperado = "69.35";
		String resultado =  FuncionTest1.getTypeConversion("dolar", "rubla", "1");
		assertEquals(esperado, resultado);	
	}
	@Test
	public void testGetTypeConverssionRublaToEuro() {		
		String esperado = "0.014";
		String resultado =  FuncionTest1.getTypeConversion("rubla", "euro", "1");
		assertEquals(esperado, resultado);	
	}
	@Test
	public void testGetTypeConverssionRublaToDolar() {		
		String esperado = "0.014";
		String resultado =  FuncionTest1.getTypeConversion("rubla", "dolar", "1");
		assertEquals(esperado, resultado);	
	}
	
	@Test
	public void testAnyadirComa() {
		
		String recibido = "2";
		String esperado = "2.";
		assertEquals(esperado, FuncionTest1.anyadirComa(recibido));
	}
	@Test
	public void testNoAnyadirSiVariasComa() {
		
		String recibido = "2";
		String esperado = "2.";
		FuncionTest1.contadorComas("2");
		assertEquals(esperado, FuncionTest1.anyadirComa(recibido));
	}
	
	@Test
	public void testNoAnyadirComa() {
		
		String recibido = "2.";
		String esperado = "2.";
		assertEquals(esperado, FuncionTest1.anyadirComa(recibido));
	} 
	
	@Test
	public void testContadorComas() {
	
		String recibido = "2.2";
		int esperado = 1;
		assertEquals(esperado, FuncionTest1.contadorComas(recibido));
	}

	@Test
	public void testTipoMoneda() {
		
		String esperado = "Euro";
		assertEquals(esperado, FuncionTest1.tipoMoneda(1));

	
		String esperado2 = "Rubla";
		assertEquals(esperado2, FuncionTest1.tipoMoneda(2));

	
		String esperado3 = "Dollar";
		assertEquals(esperado3, FuncionTest1.tipoMoneda(3));
	}

	@Test
	public void testResetValue() {
		
		String esperado = "";
		assertEquals(esperado, FuncionTest1.resetValue());
	}

	@Test
	public void testBackSpace() {
		String input="";
		String esperado = "";
		assertEquals(esperado, FuncionTest1.backSpace(input));		
	}
	@Test
	public void testBackSpaceBig() {
		String input="xxx";
		String esperado = "xx";
		assertEquals(esperado, FuncionTest1.backSpace(input));		
	}

	@Test
	public void testEuroRubla(){
		
		double resultado = FuncionTest1.euroRubla(2);
		double esperado = 141.9;
		assertEquals(esperado, resultado);	
	}

	@Test
	public void testEuroDollar(){
		
		double resultado = FuncionTest1.euroDollar(2);
		double esperado = 2.1;
		assertEquals(esperado, resultado);		
	}

	@Test
	public void testDollarEuro(){
		
		double resultado = FuncionTest1.dollarEuro(2);
		double esperado = 1.9047619047619047;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDollarRuble() {
		
		double resultado = FuncionTest1.dollarRuble(2);
		double esperado = 138.7;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRubleEuro() {
		
		double resultado = FuncionTest1.rubleEuro(2);
		double esperado = 0.028;		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRubleDollar() {
		
		double resultado = FuncionTest1.rubleDollar(2);
		double esperado = 0.028;
		assertEquals(esperado, resultado);
	}

}

