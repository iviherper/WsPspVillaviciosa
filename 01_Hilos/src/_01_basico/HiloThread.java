package _01_basico;

//Una manera de crear hilos en java, es extendiendo una clase de
//la clase Thread que ya esta implementada en la JRE
public class HiloThread extends Thread {

	private String valorImprimir;

	// String name
	public HiloThread(String valorImprimir) {
		this.valorImprimir = valorImprimir;
	}

	// Seria como un "main"
	// La duracion de este hilo ser�a desde el inicio del metodo hasta el final
	//
	@Override
	public void run() {
		//aqui nacera el hilo
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());//obtenemos el nombre del hilo
		for (int i = 0; i < 20; i++) {

			try {
				//Este metodo duerme el hilo que este pasando por esta linea durante
				//un tiempo en milisegundos
				Thread.sleep(500);//simulacion de tarea que tarda 500 milisegungdos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 0.5 segundos

			System.out
					.println("Hilo: " + Thread.currentThread().getName() 
							+ " , dice: " + valorImprimir + " ciclo: " + i);
		}
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
		//aqui morira el hilo
	}
	
	
}
