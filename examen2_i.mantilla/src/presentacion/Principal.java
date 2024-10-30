package presentacion;

import logica.Parcial;

public class Principal {
    public static void main(String[] args) {
        Parcial p = new Parcial();

        long t1;
        long t2;

        int a = 1;  
        int b = -3; 
        int c = 2;  

        try {
            t1 = System.currentTimeMillis();
            double[] resultados = p.raicesCuadratica(a, b, c);  
            t2 = System.currentTimeMillis();

            System.out.println("Raíces: x1 = " + resultados[0] + ", x2 = " + resultados[1]);
            System.out.println("Tiempo de ejecución: " + (t2 - t1) + " ms");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
