package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		

		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int num=sc.nextInt();
		
		if(numeroPrimo(num,2)) {
			System.out.println("es primo");
			
		}else {
			System.out.println("no es primo");
		}
	}
	
	private static boolean numeroPrimo(int num, int divisor) {
		
		if(num % divisor == 0 && num !=2) {
			return false;
					
		}else if(divisor>num/2) {
			return true;
			
		}else {
			return numeroPrimo(num, divisor+1);
		}
	}

}
	