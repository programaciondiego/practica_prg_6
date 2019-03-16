package es.unileon.prg.tema6;
/**
 * Clase que representa un numero entero
 * 
 * @author PRG
 * @version 1.0
 */

public class NumeroEntero {
	
	/**
	 * Valor del numero	
	 *   
	 */
	private int _valor;
	
	
	/**
	 * Constructor de la clase. Crea un numero con el valor recibido
	 * 
	 * @param valor
	 *            valor del numero 
	 * 
	 */
	public NumeroEntero(int valor){
		this._valor = valor;
	}
	
	
	/**
	 * Constructor de la clase. Crea un numero con el valor 0
	 * 
	 */
	public NumeroEntero(){
		_valor = 0;
	}
	
	
	/**
	 * Modifica el valor del numero
	 * 
	 * @return  
	 * 		Valor del numero
	 */
	void setValor(int nuevoValor) {
		_valor = nuevoValor;
	}
	
	/**
	 * Retorna el valor del numero
	 * 
	 * @return  
	 * 		Valor del numero
	 */
	int getValor(){
		return _valor;
	}
	
	/**
	 * Incrementa en 1 el valor del numero
	 * 
	 */
	void incrementar(){
		if ( _valor < Integer.MAX_VALUE ) _valor = _valor + 1;
	}
	
	/**
	 * Decrementa en 1 el valor del numero
	 * 
	 */
	void decrementar(){
		if ( _valor > Integer.MIN_VALUE ) _valor = _valor - 1;
	}
	
	/**
	 * Pone a 0 el valor del numero
	 * 
	 */
	void poneraCero(){
		_valor = 0;
	}
	
	/**
	 * Suma el numero entero con otro
	 *  
	 * @parame n  
	 * 		Numero con el que se suma
	 * @return  
	 * 		Objeto de tipo NumeroEntero cuyo valor es la suma
	 */
	NumeroEntero suma(NumeroEntero n)
	{
	
		NumeroEntero suma=new NumeroEntero(_valor+n.getValor());
		return suma;
	}
	
	
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append(_valor);
		
		return salida.toString();
		
	}
	
	
	 // -- Inicio modificacion del ejercicio10 Apartado030101.
	  boolean equals(NumeroEntero n){

	  	boolean salida = false;

	 	if (_valor==n._valor) {
	 		salida = true;
	 	}
	 	if (_valor!=n._valor){
	  		salida = false;
	 	}
	 	return salida;
	  }
	 // -- Fin modificacion del ejercicio10 Apartado030101
	 
	 
	
	
	//-- Inicio modificacion del ejercicio02 Apartado030102.
	 int comapreTo(NumeroEntero n){
	 	
	 	int salida = 0;

        if (_valor > n._valor){
           salida = -1;
        }
        else if (_valor < n._valor) {
           salida = 1; 
        }
        else{
           salida = 0;
        }
	 	
	  return salida;
	 }
	// -- Fin modificacion del ejercicio02 Apartado030102.
	 
	
	
	
	// -- Inicio modificacion del ejercicio05 Apartado030202.
	int numeroDigitos(){
		
		String cadena = toString();
		int salida=0;

		while (salida!=cadena.length()) {
			salida++;
		}

		return salida;
	}
	
	int inverso(){
	
        String cadenaDada = String.valueOf(_valor);
        StringBuffer nuevoDigito = new StringBuffer();
        int contador = cadenaDada.length()-1;

        while(contador >= 0){
           nuevoDigito.append(cadenaDada.charAt(contador));
           contador--;
        }

        cadenaDada=nuevoDigito.toString();
        int inverso = Integer.parseInt(nuevoDigito.toString());

		return inverso;

	}
	
	boolean esCapicua() {
		
		boolean salida = false;

		salida = (getValor() == inverso());

		return salida;

		}
	// -- Fin modificacion del ejercicio05 Apartado030202.
	
	
	
	
}