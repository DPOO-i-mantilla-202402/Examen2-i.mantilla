package presentacion;

import logica.Parcial;

public class Principal {
	public static void main(String[] args) {
		Parcial p = new Parcial();

		long t1;
		long t2;

		t1 = System.currentTimeMillis();
		p.esPrimo5(p);
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);

}
