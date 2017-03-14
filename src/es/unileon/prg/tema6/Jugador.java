package es.unileon.prg.tema6;
/**
 * 
 * 
 * Definicion de la clase Jugador
 *   
 * @author PRG 
 * @version (1.0)
 *
 */


public class Jugador
{
	/**
	 * Nombre del jugador
	 * 
	 */
    private String _nombre;
    
    /**
	 * Puntos ATP
	 * 
	 */
    private double _puntosATP;
    
    
    /**
	 * Constructor de la clase.
	 * 
	 * @param nombre
	 * @param puntosATP
	 *           
	 */
    public Jugador(String nombre, double puntosATP)
    {
        _nombre=nombre;
        _puntosATP=puntosATP;
    }
    
    
    /**
	 * Obtiene el nombre del jugador
	 * 
	 * @return Retorna el nombre del jugador
	 */
    public String getNombre()
    {
        return _nombre;
    }

    /**
	 * Obtiene los puntos ATP del jugador
	 * 
	 * @return Retorna los puntos ATP del jugador
	 */
    public double getPuntosATP()
    {
        return _puntosATP;
    }
    
    /**
	 * Cambia los puntos ATP del jugador
	 * 
	 * @param puntosATP
	 */
    public void setPuntosATP(double puntosATP)
    {
        _puntosATP=puntosATP;
    }

    
}
