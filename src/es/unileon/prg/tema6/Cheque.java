package es.unileon.prg.tema6;

/** Clase que representa un cheque definido con un numero y los digitos que tiene el mismo
 * Impementa un metodo para comprobar que un cheque es falso
 * @author PRG
 * @version (1.0)
 */

public class Cheque
{
	/**
	 * Digitos del cheque
	 * 
	 */
    private int _DIGITOS = 10;
    /**
	 * Numero que identifica al cheqte
	 * 
	 */
    private String _numeroDeCheque;

    /**
     *  Constructor de la clase Cheque. Recibe un String con el numero de
     *  Cheque
     *  @param numero Numero del cheque
     */
     public Cheque(String numero)
     {
         this._numeroDeCheque = numero;
     }

    /**
     * Devuelve true si el numero de cheque es falso y
     * false si es correcto
     * @return true si el cheque es falso, false en caso contrario
     */

    public boolean esFalso()
    {
    	boolean esFalso=false;
    	//Inicio modificacion - ejercicio02() de la clase Apartado030204 -.
    	
    	
    	
    	//Fin modificacion - ejercicio02() de la clase Apartado030204 -.
    	return esFalso;
    }   
    
    
}
