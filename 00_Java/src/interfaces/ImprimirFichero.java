package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible{

	@Override
	public void imprimir(String frase){
		File file = new File("prueba.txt");
		//Desde java 1.7 se puden usar los bloques
		//try/catch autoclosables
		
		//lo que va dentro del try siempre va a ejecutar el 
		//metodo close() de o no de excepcion
		try (PrintWriter pw = new PrintWriter(file)){
			pw.print(frase);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	/* Esto seria antes de java 1.7
	@Override
	public void imprimir(String frase) {
		File file = new File("prueba.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			pw.print(frase);			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//bloque se ejecuta siempre haya o no haya excepcion
			if(pw != null) {
				pw.close();
			}
		}
		
	}
	*/
}
