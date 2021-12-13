/*
 Cree una clase llamada 'NoGenerica' que almacene tres objetos del mismo tipo, 
 junto con los métodos para almacenar y extraer estos objetos y un constructor para inicializar los tres. 
 Comprueba que no se pueden poner cualquier tipo de variable en la llamada a la función.
 */
package n1ejercicio1;

//este ejercicio demuestra una manera de que otro objeto se comporte como un generico, ya que en la instancia de los objetos,
//no importa el orden ya que son del mismo tipo, si fueran de diferentes tipos si que no se podrian alterar 
//el orden de los parametros del constructor

public class Main {
	
	public static void main(String[]args) {
	
		NoGenerica ng1 = new NoGenerica("d1","d2","d3");
		NoGenerica ng2 = new NoGenerica("d2","d1","d3");
		NoGenerica ng3 = new NoGenerica("d3","d2","d1");
	
	}
}
