
public class MainJava {
	public static void main(String[] args) {
		//El ciclo de vida de un objeto en java
		//dura el tiempo en el que alguna referencia
		//le este apuntando
		int numeroPersona = 0;
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
		
		System.out.println(sumar(1,2));
		System.out.println(sumar(1,2,3,4,5,6));
		System.out.println(sumar(4,5,6,0));
		System.out.println(sumar());
		
		MainJava mj = new MainJava();
		mj.metodo1();
	}
	
	public static int sumar(int n1, int n2){
		return n1 + n2;
	}
	
	public static double sumar(int n1, int n2, int n3){
		return n1 + n2;
	}
	
	//numero indeterminado de parametros de entrada
	public static int sumar(int... parametros) {
		
		int resultado = 0;
		
		for(int numero : parametros) {
			resultado += numero;
		}
		
		return resultado;
	}

	public void metodo1() {
		System.out.println("Hola chavales queridos de villaviciosa de odon");
	}

}
