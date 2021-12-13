/*
 *  Crea dos interfaces Interficie1 e Interficie2, 
 *  y una clase ImplementadoraDoble que implemente ambas interficies.
 *  Crea la clase llamada ClaseGenerica con dos métodos genéricos, 
 *  metode1() que tenga un parámetro limitado por la primera interfaz y 
 *  metode2() que tenga otro parámetro que esté limitado por la segunda interfaz. 
 *  Crea una instancia de la clase ImplementadoraDoble (que implementa ambas interfaces) 
 *  y demuestre que se puede utilizar con ambos métodos genéricos de 'ClaseGenerica'.
 */
package n2ejercicio2;

public class Main {

	public static void main() {
		
		//se instancian ambas clases
		ImplementadoraDoble imDoble = new ImplementadoraDoble();
		Generica gen = new Generica();
		
		//se demuestra que se puede utilizar con ambos metodos genericos de la clase Generica
		gen.metodo1(imDoble);
		gen.metodo2(imDoble);
	
	}
}
