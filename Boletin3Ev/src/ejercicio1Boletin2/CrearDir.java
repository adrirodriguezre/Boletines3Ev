package ejercicio1Boletin2;

import java.io.File;

public class CrearDir{

	public static void main(String[] args) {
		try {
			String home = System.getProperty("user.home");
			File dir = new File(home + File.separator + "Desktop" + File.separator + "Boletin2" + File.separator + "Ejercicio1");
			dir.mkdirs();
			File archivo = new File(home + File.separator + "Desktop" + File.separator + "Boletin2" + File.separator + "Ejercicio1" + File.separator + "ejercicio1.txt");
			archivo.createNewFile();
		} catch (Exception ex) {
			System.out.println("Error en la creación del directorio");
		} 

	}
}

