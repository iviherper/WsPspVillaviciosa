package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasico.modelo.entidad.Persona;

//Esta clase servira como punto de entrada de nuestro servicio REST
//para ello debemos de crear un objeto que sea gestionado por spring
//para que reciba las peticiones

//para dar de alta un objeto utilizaremmos la siguiente anotacion
@RestController
public class ControladorMensaje {
	
	private String mensaje = "Esto es un mensaje de prueba";
	
	//Los metodos de esta clase, gracias a la anotacion restcontroller, nos
	//serviran a partir de ahora para recibir peticiones http de nuestros
	//clientes (que pueden ser perfectamente un navegador web)
	
	//Con esto lo que estamos haciendo es mapear el recurso "mensaje" con el 
	//metodo http GET. La url completa sería "http://localhost:8080/mensaje"
	//si la ponemos en la barra de un navegador, por defecto los navegadores
	//hacen una peticion "GET" al recurso que estamos poniendo en la URL
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		//podemos simular un error de servidor (codigo 500)
		//String s = null;
		//s.toUpperCase();//nullpointerexception
		return mensaje;
	}
	
	//podemos mapear todos los recursos que queramos con el método http que
	//queramos tambie. Dentro de la etiqueta podemos poner el parámetro "produces"
	//que le estaremos indicando el mime type que tenemos que poner en nuestra
	//cabecera "content-type" de nuestro http response, y que sera leido por nuestro
	//cliente e intrepretado a su manera.
	//si ponemos el mime type como "text/html" entonces el navegador leera el 
	//body como un html, y si ponemos "text/plain" entonces lo interpretará como
	//un texto plano
	@GetMapping(value = "mensajeHTML", produces = "text/html")
	public String obtenerMensajeHTML() {
		//esta clase es muy buena para concatenar Strings
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html>");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title>Prueba html</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h1 style='color:red'>ESTO SERIA UN MENSAJE EN HTML");
		buffer.append("</body>");
		buffer.append("</html>");
		
		return buffer.toString();
	}
	
	@GetMapping("persona")
	public Persona obtenerPersona() {
		Persona p = new Persona();
		p.setEdad(45);
		p.setNombre("Goku");
		return p;//los objetos por defecto se mandan en notacion JSON
	}
	
	//Cuanod alguien me ponga el recurso mensaje con el verbo PUT entrare por este
	//metodos
	//Si alguien me pone "http://localhost:8080/mensaje" con el metodo "PUT"
	//sera cuando entre en este metodo
	@PutMapping("mensaje")
	public String modificarMensaje() {
		System.out.println("entrando a mensaje por put");
		mensaje = "he modificado el mensaje";
		return "OK";
	}
}
