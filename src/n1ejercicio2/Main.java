
/*
 Cree una clase llamada 'GenericMethods' con un método genérico llamado 'f()' que acepte tres argumentos de tipo genérico. 
 Realiza al 'main()' diferentes llamadas de este método con distintos tipos parámetros. Comprueba que se pueden poner cualquier tipo de variable.
 */
package n1ejercicio2;

public class Main {
	
	public static void main(String[]args) {
		
		GenericMethod gm = new GenericMethod();
		
		gm.f("pedro", "hola", 3);
		
		gm.f(12, "hola", true);
	
		gm.f(false,"a", 3);
		
	}
}
