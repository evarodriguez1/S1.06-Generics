/*
 * Crea una interfaz llamada MiInterfaz con dos métodos metode1() y metode2(). 
 * Crea una clase llamada Implementadora que implemente esta interfaz y añada un tercer método llamado metode3().
 * En otra clase llamada Generica, crea el método genérico llamado metodeGeneric() con un tipo de argumento que
 * esté limitado por la interfaz MiInterfaz.
 * Demuestre que los métodos de la interfaz son invocables dentro de este método genérico. main(), 
 * pasa una instancia de la clase Implementadora al método genérico metodeGeneric().
 */
package n2ejercicio1;

public class Main {

	public static void main(String[]args) {
		
		Implementadora implem = new Implementadora();
		Generica gen = new Generica();
		
		gen.metodeGeneric(implem);
		
	}
}
