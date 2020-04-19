package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número");
		int num2=sc.nextInt();
		System.out.println("El resultado es: "+producto(num1,num2));
		

	}
	
	public static int producto(int num1, int num2) {
		
		if(num2 == 1) {
			
			return num1;
			
		}else {
			return num1 + producto(num1,num2-1);
		}
	}

}
