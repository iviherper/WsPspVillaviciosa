package interfaces;

public class MainInterfaces {
	 public static void main(String[] args) {
		//Con una referencia de una interfaz puedo 
		 //apuntar a cualquier objeto de una
		 
		ImprimirPantalla i = new ImprimirPantalla();
		ImprimirFichero i2 = new ImprimirFichero();
		usarImprimir(i);
		usarImprimir(i2);
	}
	 
	//este metodo lo usa gente de bilbao que imprimen por pantalla
	 
	 public static void usarImprimir(Imprimible i4) {
		 i4.imprimir("Esta es la frase");
	 }
}
