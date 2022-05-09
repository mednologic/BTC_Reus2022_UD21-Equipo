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
	public String resetValue() {
		String retorno="";
		return retorno;
	}
	//Bontón borrar un caracter
	public String backSpace(String inputValue) {
		String retorno="";
		int len = inputValue.length();
		retorno=inputValue;
		//Borramos un caracter
        if(len>=1)
        	retorno=retorno.substring(0,len-1);
		return retorno;
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


}
