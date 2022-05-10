package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;

public class Funciones {
	
	//public Vista vista= new Vista();
	//Constructor vacio

	public String getTypeConversion(String valorJComboBox1, String valorJComboBox2, String inputValue, Vista vista) {
		String retorno="";
		//Try to control the empty value
		try {
			String sumaStrings=valorJComboBox1+valorJComboBox2;
			Double valorOperar = Double.parseDouble(inputValue);
			
			//Sumamos los strings recibidos para que el sitch los reciva
			sumaStrings = sumaStrings.toLowerCase();
			
			switch(sumaStrings) {
				case "eurodolar":
					retorno =Double.toString(euroDollar(valorOperar));
					break;
				case "eurorubla":
					retorno =Double.toString(euroRubla(valorOperar));
					break;
				case "dolareuro":
					retorno =Double.toString(dollarEuro(valorOperar));
					break;
				case "dolarrubla":
					retorno =Double.toString(dollarRuble(valorOperar));
					break;
				case "rublaeuro":
					retorno =Double.toString(rubleEuro(valorOperar));
					break;
				case "rubladolar":
					retorno =Double.toString(rubleDollar(valorOperar));
					break;	
			}
				
		}catch(Exception e){
			//Return empty value
			return retorno;
		}
		return retorno;
		
	}
	
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
	//Añadir coma
	public String anyadirComa(String inputValue) {
		String retorno = "";
		System.out.println("Input "+ inputValue);
		//Getting the lenght of the string
		int len = inputValue.length();
		System.out.println("longitug "+ len);
		if(len==0) {
        	//No return value
        	System.out.println("Retorno no longitud"+retorno);
        }else if(!inputValue.contains(".")){
        	System.out.println("Retorna coma"+retorno);
        		retorno=inputValue+".";	
        }
		if(len!=0){
        	retorno = inputValue+".";
        	System.out.println("Retorno con valor: "+retorno);
        }
		return retorno;
	}

	//Boton borrar un caracter
		public String backSpace(String inputValue) {
			String retorno="";
			//Getting the lenght of the string
			int len = inputValue.length();
			retorno=inputValue;
			//Borramos un caracter
	        if(len>=1) {
	        	retorno=retorno.substring(0,len-1);
	        }else {
	        	
	        }
			return retorno;
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
	public double dollarEuro(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/1.05;
		return retorno;
	}
	public double dollarRuble(double inputValue) {
		double retorno=0.0;
		retorno = inputValue*69.35;
		return retorno;
	}
	public double rubleEuro(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/0.014;
		return retorno;
	}
	public double rubleDollar(double inputValue) {
		double retorno=0.0;
		retorno = inputValue/0.013;
		return retorno;
	}


}
