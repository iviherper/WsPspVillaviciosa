package herencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainHerencia {

	public static void main(String[] args) {
		/*
		Animal a = new Animal() {
			//esto es una clase anonima
			//Una clase anonima se crea la clase y el objeto
			//una unica vez
			@Override
			public void comer(Object comida) {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		
		Trucha t = new Trucha();
		t.setNombre("Robustiana");
		t.setPeso(2);
		t.setBranqueas(2);
		t.setAletas(4);
		
		Piraña p = new Piraña();
		p.setNombre("Olivia");
		p.setBranqueas(4);
		p.setPeso(3);
		p.setAletas(4);
		
		Leon l = new Leon();
		l.setNombre("Leoncio");
		l.setPatas(4);
		l.setPeso(250);
		
		//podemos crear clases anonimas
		//por ejemplo, si en un momento dado necesito un oso
		Animal a = new Animal() {
			//Aqui creamos el oso
			
			@Override
			public void comer(Object comida) {
				if(comida instanceof Pez) {
					System.out.println("Soy el oso " + nombre + " y "
							+ "voy a comer un Pez :)");
				}else {
					System.out.println("Soy un oso no un maldito vegano :(");
				}
			}
		};
		
		a.setNombre("Yogui");
		a.setPeso(450);
		
		List<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(t);
		listaAnimales.add(p);
		listaAnimales.add(l);
		listaAnimales.add(a);
		
		Plancton plan = new Plancton();
		plan.setNutrientes(15);
		
		//t.comer(plan);
		//p.comer(plan);
		
		//podemos usar polimorfismo, una refencia de tipo y que sea
		//el objeto el que ejecute el metodo
		for(Animal animal : listaAnimales) {
			animal.comer(plan);
		}
		
		for(Animal animal : listaAnimales) {
			animal.comer(l);//Esto es una "L"
		}
		
		Leon l2 = new Leon();
		l2.setNombre("Leoncio");
		l2.setPeso(225);
		
		for(Animal animal : listaAnimales) {
			animal.comer(l2);
		}
		
		
	}

}
