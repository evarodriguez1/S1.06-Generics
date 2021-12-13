/*
 * Crea una interfaz llamada MiInterfaz con dos m�todos metode1() y metode2(). 
 * Crea una clase llamada Implementadora que implemente esta interfaz y a�ada un tercer m�todo llamado metode3().
 * En otra clase llamada Generica, crea el m�todo gen�rico llamado metodeGeneric() con un tipo de argumento que
 * est� limitado por la interfaz MiInterfaz.
 * Demuestre que los m�todos de la interfaz son invocables dentro de este m�todo gen�rico. main(), 
 * pasa una instancia de la clase Implementadora al m�todo gen�rico metodeGeneric().
 */
package n2ejercicio1;

public class Main {

	public static void main(String[]args) {
		
		Implementadora implem = new Implementadora();
		Generica gen = new Generica();
		
		gen.metodeGeneric(implem);
		
	}
}
