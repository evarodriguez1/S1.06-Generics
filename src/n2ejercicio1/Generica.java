/*
 * En otra clase llamada Generica, crea el método genérico llamado metodeGeneric() con un tipo de argumento que
 * esté limitado por la interfaz MiInterfaz.
 */
package n2ejercicio1;

public class Generica {

	public <T extends MyInterface> void metodeGeneric(T o) { //esto : <T extends MyInterface> = es el tipo de argumento limitado por la interface
		o.metodo1();
		o.metodo2();
	}
}
