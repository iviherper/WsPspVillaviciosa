package videojuego;

import java.util.Random;

public class Arco extends Arma{

	@Override
	public void usar() {
		System.out.println("chiuuuuuuuuuuuuuu");
		Random rm = new Random();
		int da�oVariable = rm.nextInt(10) + 1;
		int da�oTotal = getDa�o() + da�oVariable;
		System.out.println("Tipo: " + getTipo() + " da�o: " + da�oTotal);
	}

}
