package logica;

public class Parcial {

    public double[] raicesCuadratica(int a, int b, int c) throws Exception {
        if (a != 0 || b != 0 || c != 0) {
            int afueraraiz = (-1) * b;
            double dentroraiz = raiz(a, b, c);
            
            double resultadosuma = (afueraraiz + dentroraiz) / (2.0 * a);
            double resultadoresta = (afueraraiz - dentroraiz) / (2.0 * a);
            
            return new double[]{resultadosuma, resultadoresta};
        } else {
            throw new Exception("No se puede calcular la raíz cuadrática");
        }
    }

    public double raiz(int a, int b, int c) throws Exception {
        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            throw new Exception("No se puede calcular la raíz cuadrada ");
        }
        return Math.sqrt(discriminante);
    }
}

