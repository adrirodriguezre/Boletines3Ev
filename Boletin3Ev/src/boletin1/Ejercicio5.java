package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int num=sc.nextInt();
		
		if(esImpar(num)) {
			System.out.println("Es impar");
			
		}else if(esPar(num)) {
			System.out.println("Es par");
		}

	}
	
	public static boolean esImpar(int num) {
		
		if(num==0) {
			return false;
	
		}else {
			return esPar(num-1);
		}
	}
	
	public static boolean esPar(int num) {
		
		if(num==0) {
			return true;
			
		}else {
			return esImpar(num-1);
		}
	}

}
