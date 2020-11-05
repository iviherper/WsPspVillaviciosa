package herencia;

import javabean.Persona;

public class Piraña extends Pez{

	@Override
	public void comer(Object comida) {
		if(comida instanceof Persona) {
			Persona p = (Persona)comida;
			System.out.println("Soy la piraña " + nombre + " y me voy a "
					+ "zampar a la persona " + p.getNombre());
		}else {
			System.out.println("Solo como personas 😔");
		}
	}

	
}
