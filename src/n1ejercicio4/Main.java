package n1ejercicio4;

public class Main {
	
	public static void main (String[] args) {
		GenericMethod gm = new GenericMethod();
		
		gm.f("Pedro", "Pedro", "Pedro", true);
		gm.f("Pedro",20);
		gm.f(20,3,"Pedro");
		
	}

}
