package videojuego;

public class Espada extends Arma{
	private int da�o;
	private String tipo;
	
	@Override
	public void usar() {
		System.out.println("Swannnnnnggg");
		System.out.println("Tipo: " + tipo + " da�o: " + da�o);
	}
	
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
