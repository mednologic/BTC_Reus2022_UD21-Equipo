package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

public class Funciones {
	
	int valorInput;
	
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
		case 4:
			tipoMoneda="Gribna";
			break;
		case 5:
			tipoMoneda="Pounds";
			break;
		}
		
		return tipoMoneda;
		
	}

}
