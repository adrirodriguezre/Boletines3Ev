package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("Introduce una base:");
		int base=sc.nextInt();
		System.out.println("Introduce un exponente:");
		int exponente=sc.nextInt();
		System.out.println("El resultado es: "+potencia(base,exponente));

	}
	
	public static int potencia(int base, int exponente) {
		
		if(exponente==0) {
			return 1;
			
		}else {
			
			return base * potencia(base, exponente-1);
		}
		

	}

}
