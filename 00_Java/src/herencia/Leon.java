package herencia;

public class Leon extends Animal{
	private int patas;

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public void comer(Object comida) {
		if(comida == this) {
			System.out.println("No me pienso comer a mi mismo :/");
			return;
		}
		
		//comida.getClass().getSimpleName(), devuelve el nombre de la clase a la que pertenece el objeto
		if(comida instanceof Animal) {
			Animal a = (Animal)comida;
			System.out.println("Soy el leon " + nombre + " y me voy a comer al animal "
					+ comida.getClass().getSimpleName() + " que se llama " + a.nombre);
		}else {
			System.out.println(" BUUUU no me gusta eso " + comida.getClass().getSimpleName());
		}
		
	}
	
	
}
