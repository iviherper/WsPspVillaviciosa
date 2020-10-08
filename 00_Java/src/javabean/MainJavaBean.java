package javabean;

import java.util.ArrayList;

public class MainJavaBean {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		p1.setNombre("Son Goku");
		p1.setEdad(40);
		p1.setAltura(1.72);
		p1.setEdad(-38);
		System.out.println(p1.getEdad());
		
		String direccion = "Calle diamente 58, Majadahonda, Madrid, 28223";
		String direccion2 = "28122, Madrid,...";
		
		long cp = 03456;
		//los numeros que empiezan por 0
		//estan en base octal
		System.out.println(cp);
		int hex = 0x123FE;
		int bin = 0b101;
		System.out.println(bin);
		
		System.out.println(p1.getDireccion());
		//esto se puede hacer pero da error de ejecucion
		//p1.getDireccion().setNombreVia("Namek");
		
		//primitivos
		//int, char, float, double, boolean, long, byte
		
		//String, Persona, ArraList,...
		
		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		
		d1.setCiudad("Namek");
		System.out.println(p1.getDireccion().getCiudad());
		
		p1.getDireccion().setCp("28224");
		System.out.println(d1.getCp());
		
		//
		p1.setDireccion(new Direccion());
		p1.getDireccion().setCiudad("Kaito planet");
		
		System.out.println(d1.getCiudad());
		System.out.println(p1.getDireccion().getCiudad());
		
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		Persona p2 = new Persona();
		listaPersona.add(p2);
		
		p2.setNombre("Krilin");				
		
		System.out.println(listaPersona);
		
		listaPersona.get(0).setNombre("Pikolo");
		
		System.out.println(p2.getNombre());
		
		Persona p3 = p2;
		p2.setNombre("Ten Shin Han");
		
		System.out.println(listaPersona.get(0).getNombre());
		
		Direccion d2 = new Direccion();
		p2.setDireccion(d2);
		
		listaPersona.get(0).getDireccion().setNombreVia("Via Lactea");
		System.out.println(p2.getDireccion().getNombreVia());
		
		//cuantas manerasd hay de poner la ciudad direccion de ten shian a "planeta Vegeta"
		listaPersona.get(0).getDireccion().setCiudad("Vegeta");
		p2.getDireccion().setCiudad("Vegeta");
		d2.setCiudad("Vegeta");
		p3.getDireccion().setCiudad("Vegeta");
		
		d2 = new Direccion();
		d2.setCiudad("Universo 9");
		
		//p3.setDireccion(null);
		//System.out.println(p2.getDireccion().getNombreVia());
		
		String s1 = "Pepe";
		String s2 = "Pepe";
		String s3 = "Pepe";
		
		if(s1 == s2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		s3 = "Laura";
		s2 = "Otro";
	}

}
