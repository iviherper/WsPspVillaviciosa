package interfaces;

//Las interfaces son clases en los que todos los metodos son
//abstractos. 
//Las interfaces son una declaracion de intenciones que queremos
//que implementen las clases que usen dicha interfaz
//Las interfaces definen el "QUE" mientras que las clases que 
//implementen la interface definen el "COMO"
//Cuando usamos una interfaz estamos firmando un contrato de compromiso
//de que vamos a implementar todos sus metodos
//A direfencia de la herencia, una clase puede implementar todas
//las interfaces que quiera
public interface Imprimible {
	//Si le ponemos atributos a una interfaz se convierten
	//en constantes
	
	/**
	 * Debe de imprimir por el dispositivo que este asociado
	 * una frase
	 * @param frase frase a imprimir
	 */
	public void imprimir(String frase);
}
