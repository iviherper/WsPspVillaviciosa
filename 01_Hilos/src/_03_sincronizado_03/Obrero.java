package _03_sincronizado_03;

public class Obrero extends Thread{
	
	private int inicioLadrillo,finLadrillo;
	private String nombre;
	private Silla silla;
	
	//1, 100
	public Obrero(int inicioLadrillo, int finLadrillo, String nombre) {
		this.inicioLadrillo = inicioLadrillo;
		this.finLadrillo = finLadrillo;
		this.nombre = nombre;
	}
	
	//Esto es excatamente "igual" a un main de java
	@Override
	public void run() {
		ponerLadrillos();//los obreros cuando se ejecuta su start, se ponen a poner ladridos como locos!
	}
	
	
	public void ponerLadrillos() {
		for(int i = inicioLadrillo;i<=finLadrillo;i++) {
			System.out.println("Obrero " + nombre + " esta Poniendo el ladrillo " + i);
			try {
				Thread.sleep(1000);
				//este sleep simula el tiempo que tarda el obrero
				//en poner un ladrillo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			//cada 10 ladrillos un obrero descansa
			//y se sienta en la silla durante 10 segundo
			if(i % 10 == 0) {
				silla.descansar(this);
			}
			
		}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Silla getSilla() {
		return silla;
	}

	public void setSilla(Silla silla) {
		this.silla = silla;
	}
	
	
}
