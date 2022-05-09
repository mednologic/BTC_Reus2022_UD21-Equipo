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
	//Boton borrar un caracter
		public String backSpace(String inputValue) {
			String retorno="";
			int len = inputValue.length();
			retorno=inputValue;
			//Borramos un caracter
	        if(len>=1)
	        	retorno=retorno.substring(0,len-1);
			return retorno;
		}
	
	public void getTypeConversion(String valorJComboBox1, String valorJComboBox2, double inputValue) {
		String sumaStrings=valorJComboBox1+valorJComboBox2;
		sumaStrings = sumaStrings.toLowerCase();
		
		switch(sumaStrings) {
		
		case "eurodolar":
			euroDollar(inputValue);
			break;
		case "eurorubla":
			
			break;
		case "dolareuro":
			
			break;
		case "dolarrubla":
			
			break;
		case "rublaeuro":
			
			break;
		case "rubladolar":
			
			break;
		}
		
	}
	
	public double euroDollar(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*1.05;
		return retorno;
	}
	public double euroRubla(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*70.95;
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
