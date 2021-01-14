package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Esta clase servira como punto de entrada de nuestro servicio REST
//para ello debemos de crear un objeto que sea gestionado por spring
//para que reciba las peticiones

//para dar de alta un objeto utilizaremmos la siguiente anotacion
@RestController
public class ControladorMensaje {
	//Los metodos de esta clase, gracias a la anotacion restcontroller, nos
	//serviran a partir de ahora para recibir peticiones http de nuestros
	//clientes (que pueden ser perfectamente un navegador web)
	
	//Con esto lo que estamos haciendo es mapear el recurso "mensaje" con el 
	//metodo http GET. La url completa sería "http://localhost:8080/mensaje"
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		return "esto es un mensaje de prueba";
	}
}
