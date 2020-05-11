package ejercicio1Boletin2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFich {

	public static void main(String[] args) {
		
		FileReader leer;
		String texto="";
		
		try {
			String home = System.getProperty("user.home");
			String path=(home + File.separator + "Desktop" + File.separator + "Boletin2" + File.separator + "Ejercicio1" + File.separator + "ejercicio1.txt");
			leer= new FileReader(path);
			BufferedReader contenido=new BufferedReader(leer);
			while((texto=contenido.readLine())!=null) {
				
				System.out.println(texto);	
			}
		} catch(Exception e) {
			
			System.out.println("Error al leer");
			
		}

	}

}
