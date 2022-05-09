package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

public class Funciones {
	
	public String tipoMoneda(int opcion) {
		String tipoMoneda="";
		switch(opcion) {
		case 1:
			tipoMoneda="Euro";
			break;
		case 2:
			tipoMoneda="Rubla";
			break;
		case 3:
			tipoMoneda="Dollar";
			break;
		}
		
		return tipoMoneda;
	}
	//Resetea los numeros introducidos "boton borrar"
	public double resetValue() {
		return 0;
	}
	public double euroRubla(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*70.95;
		return retorno;
	}
	public double euroDollar(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*1.05;
		return retorno;
	}
	public double DollarEuro(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/1.05;
		return retorno;
	}
	public double DollarRuble(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*69.35;
		return retorno;
	}
	public double RubleEuro(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/0.014;
		return retorno;
	}
	public double RubleDollar(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/0.013;
		return retorno;
	}


}
