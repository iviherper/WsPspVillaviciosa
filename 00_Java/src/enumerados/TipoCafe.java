package enumerados;

//los enumerados son clases, pero que sus objetos estan
//predefinidos desde el inicio del programa

//Una de las ventajas es que es una coleccion ordenada de
//elementos
public enum TipoCafe {
	//Aqui creamos los objetos
	SOLO(1),CON_LECHE(1.3),EXPRESSO(1.5),LATTE(2.5),AMERICANO(1.3),CARAJILLO(2.5),
	CAPUCCINO(3),CON_HIELO(1), CORTADO(1.2), IRLANDES(4);
	//No podemos crear objetos de TipoCafe, estan predefinidos
	//y son estos 8 tipos
	
	private double precio;
	
	private TipoCafe(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
