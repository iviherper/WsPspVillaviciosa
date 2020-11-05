package herencia;

public abstract class Pez extends Animal{
	
	private int branqueas;
	private int aletas;

	@Override
	public void comer(Object comida) {
		if(comida instanceof Plancton) {//si me estas pasando un plancton
			Plancton p = (Plancton)comida;
			System.out.println("Soy el pez " + nombre + " y me voy a comer un placton que tiene "
					+ p.getNutrientes() + " nutrientes");
		}else {
			System.out.println("Puajjjjjjjjj!!! No me gusta eso!!!!!!!!!");
		}
	}

	public int getBranqueas() {
		return branqueas;
	}

	public void setBranqueas(int branqueas) {
		this.branqueas = branqueas;
	}

	public int getAletas() {
		return aletas;
	}

	public void setAletas(int aletas) {
		this.aletas = aletas;
	}

	
}
