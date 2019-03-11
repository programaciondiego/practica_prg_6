package es.unileon.prg.tema6;

public class Ecuacion2Grado{

	private int a, b, c;

	public Ecuacion2Grado(int a,int b,int c){

		this.a=a;
		this.b=b;
		this.c=c;

	}

	int getA(){
		return a;
	}

	int getB(){
		return b;
	}

	int getC(){
		return c;
	}	


	String numeroSoluciones(){

		double resultado1 = 0;
		double resultado2 = 0;
		int numeroSoluciones;
		StringBuffer soluciones = new StringBuffer();


		if (Math.pow(b,2)-(4*a*c) > 0) {
			resultado1 = (((-b)+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a);
			resultado2 = (((-b)-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a);  

			if (resultado1==resultado2) {
				numeroSoluciones = 1;
				soluciones.append(numeroSoluciones+" soluciones, y es: "+ resultado1);
			}else{
				numeroSoluciones = 2;
				soluciones.append(numeroSoluciones+" soluciones, y son: "+ resultado1+" y "+resultado2);
			}
		
		}else{
			numeroSoluciones = 0;
			soluciones.append(numeroSoluciones+" soluciones");
		}

		return soluciones.toString();
	}


	public String toString(){

		StringBuffer salida = new StringBuffer();

		salida.append("La ecuacion "+a+"x²+"+b+"x+"+c+" tiene ");
		salida.append(numeroSoluciones());

		return salida.toString();
	}

}
