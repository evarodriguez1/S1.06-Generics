package n2ejercicio2;

public class Generica {
	
	public <T extends Interface1> void metodo1(T o) { //parametro limitado por interface1
		o.f();
		o.g();
	}
	
	public <T extends Interface2> void metodo2(T o) { //parametro limitado por la interface2
		o.j();
		o.k();
	}
}
