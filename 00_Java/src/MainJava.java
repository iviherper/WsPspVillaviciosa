
public class MainJava {
	public static void main(String[] args) {
		//El ciclo de vida de un objeto en java
		//dura el tiempo en el que alguna referencia
		//le este apuntando
		new Persona();
		//en este caso el objeto sera eliminado
		//en un momento indeterminado por el GC
		System.out.println("Hola chico!");
		
		//El ciclo de vida de una variable es el bloque
		//donde haya sido declarada
		Persona p2;
		{
			Persona p1 = new Persona();
			System.out.println("Estais flipando!");
			p1.edad = 4;
			p2 = p1;
			p2.edad = 78;
			System.out.println(p1.edad);
		}
		// Aqui p1 no existe
		//p1.edad = 1;
		System.out.println(p2.edad);
	}
}
