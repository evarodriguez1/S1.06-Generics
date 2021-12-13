/*
 Crea un método genérico que tome como argumento un contenedor Holder<List<?>>.
 Determina qué métodos puede o no invocar para el contenedor Holder y para la lista List. 
 Repite el ejercicio para un argumento de tipo List<Holder<?>>. 
 */
package n3ejercicio1;

import java.util.List;

public class Main <T> {

	public static class Holder<T> {
		T obj1;
		
		public void caja(Holder<List<?>> t) {
			t.equals(obj1); //le podemos dar metodos tanto de List como del genérico
			
			
		}
		
		public void caja2(List<Holder<?>> t) {
			t.add(0,null); //le podemos dar metodos tanto de List como del genérico
			
			
		}
		
	}
}

