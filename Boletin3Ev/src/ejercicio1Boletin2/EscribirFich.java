package ejercicio1Boletin2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFich {

	public static void main(String[] args) {
		
		FileWriter escribir;
		
		try {
			String home = System.getProperty("user.home");
			String path=(home + File.separator + "Desktop" + File.separator + "Boletin2" + File.separator + "Ejercicio1" + File.separator + "ejercicio1.txt");
			escribir= new FileWriter(path);
			escribir.write("Prueba de escritura en fichero");
			escribir.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("Error. No se ha encontrado el fichero");
			
		} catch (IOException e) {
			
			System.out.println("Error al escribir");
		}
		
	}

}
