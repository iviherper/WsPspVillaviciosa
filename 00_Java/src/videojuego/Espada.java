package videojuego;

public class Espada extends Arma{
	private int daño;
	private String tipo;
	
	@Override
	public void usar() {
		System.out.println("Swannnnnnggg");
		System.out.println("Tipo: " + tipo + " daño: " + daño);
	}
	
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
