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
}
