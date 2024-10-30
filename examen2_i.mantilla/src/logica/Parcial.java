package logica;

public class Parcial {
	
	public int raicesCuadratica(int a, int b, int c) throws Exception {
		if(a != 0 || b!=0 ||c!=0){
			
			int afueraraiz=(-1)*a;
			int dentroraiz=raiz(a, b,c);
			int resultadosuma=0;
			int resultadoresta=0;
			
			resultadosuma=(afueraraiz+dentroraiz)/(2*a);
			resultadoresta=(afueraraiz-dentroraiz)/(2*a);
			
			return a/b;
		}else {
			throw new Exception("No se puede sacar raiz");
		}
	}
	
	public int raiz(int a, int b, int c) throws Exception {
		
		int dentro_raiz=0;
		
		
		if(a != 0 || b!=0 ||c!=0){
			return resultado;
			
		}
		if (dentro_raiz<0){
			
		throw new Exception("No se puede sacar raiz");
		
		}else {
			throw new Exception("No se puede sacar raiz");
		}
	}

}
