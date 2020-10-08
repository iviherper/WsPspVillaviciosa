package javabean;

//QUe es un javabean?
//Un javabean es una clase cuyos atributos son
//privados y tienen metodos accesores y modifacadores
//publicos, tambien conocidos como get/set

//Cuando se crea un objeto con new, 
//los atributos primitivos toman valor de 0
//los atributos de referencia toman el valor de null
public class Persona{
	private String nombre;
	private int edad;
	private double altura;
	//Para saber si una clase tiene a otra
	//nos hacemos la pregunta "tiene un" e iria
	//como atributo de clase
	private Direccion direccion;
	private Persona hijo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad >= 0) {
			this.edad = edad;
		}else {
			this.edad = 0;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", direccion=" + direccion
				+ ", hijo=" + hijo + "]";
	}
	
	
}
