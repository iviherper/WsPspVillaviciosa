Proyecto Springboot Rest
-
Este ejemplo es la creacion de un proyecto spring boot para hacer un servicio REST
En la carpeta "dibujos" tenemos las fotos del protocolo HTTP, ya que REST esta 
muy ligado al protocolo HTTP.

Para crear este proyecto debemos de crear un proyecto spring boot:

1) boton derecho sobre package explorer -> new -> Spring starter proyect

2) En la opciones debemos de cambiar lo siguiente y pulsar next:

	a) el nombre del proyecto
	b) elegir la version java que queramos (este caso 8)
	c) IMPORTANTE, empaquetar el proyecto en formato WAR
	d) podemos cambiar el paquete por defecto (en este caso com.uem.restbasico)
	
3) En la siguiente pantalla debemos de elegir el starter web -> spring web

Al ser un proyecto web, spring automáticamente configura un tomcat donde se
desplegará nuestra app (esto aunque no lo creais, es la leche en vinagre, porque
configurar un tomcat puede llevar mucho trabajo, y spring boot me lo hace
automáticamente)

A partir de aqui debermos de dar de alta las clases que gestionen el servicio rest
en nuestro caso, las daremos de alta en el paquete "com.uem.restbasico.controlador"

Si el puerto del tomcat da fallo podeis cambiarlo en 
"src/main/resources/applicatioin.properties"

