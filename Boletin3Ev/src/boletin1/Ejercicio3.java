package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
	}
	
	private static String obtenerReverso(String cadena, int pos) {
		
		if(cadena.length() == 1) {
			
			return cadena;
			
		}else {
			
			return cadena.length()+ obtenerReverso(cadena, pos-1);
		}
	}

}
