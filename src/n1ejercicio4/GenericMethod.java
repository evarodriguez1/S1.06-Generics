/*
 Modifique a su vez el punto anterior de forma que los argumentos que recibe 'f()' sea una lista de argumentos variable indefinida.
 */
package n1ejercicio4;

public class GenericMethod<T> {

	private T d1;
	private T d2;
	private T d3;
	
	
	public void f(T... v) {  //----> argumento de longitud variable
		System.out.println(v);
	}
}
