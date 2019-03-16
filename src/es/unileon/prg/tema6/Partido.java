package es.unileon.prg.tema6;

/**
 * 
 * 
 * Definicion de la clase Partido
 *   
 * @author PRG
 * @version (1.0)
 *
 */

public class Partido
{
    
	/**
	 * Jugador 1 del partido
	 * 
	 */
    private Jugador _jugador1;
    /**
	 * Jugador 2 del partido
	 * 
	 */
    private Jugador _jugador2;
    /**
	 * Ganador del partido. Si su su valor es null todavia no se ha jugado el partido
	 * 
	 */
    private Jugador _ganador;
    
    
    
    /**
	 * Constructor de la clase. Crea un partido con los jugadores introducidos
	 * 
	 * @param jugador1
	 * @param jugador2
	 *           
	 */
    public Partido(Jugador jugador1, Jugador jugador2)
    {
    	_jugador1 = jugador1;
    	_jugador2 = jugador2;
        _ganador=null;
    }
    
    /**
	 * Retorna el jugador 1 
	 * 
	 * @return Retorna el jugador 1 
	 */    
    public Jugador getJugador1()
    {
        return _jugador1;
    }
    
    /**
	 * Retorna el jugador 2
	 * 
	 * @return Retorna el jugador 2
	 */
    public Jugador getJugador2()
    {
        return _jugador2;
    }
    
    /**
	 * Juega el partido y genera el ganador
	 * 
	 */
    public void jugar() 
    {
        //Inicio modificacion - ejercicio06() de la clase Apartado030202 -
    	
        double resultado1=0;
        double resultado2=0;
        int juego1 = 0;
        int juego2 = 0;
        int sets1 = 0;
        int sets2 = 0;
        while( (sets1!=7 && sets2!=7) && !(sets1+2==sets2 || sets2+2==sets1)  ){

            while(juego1<6 && juego2<6){

                resultado1=Math.random()*_jugador1.getPuntosATP();
                resultado2=Math.random()*_jugador2.getPuntosATP();

                if (resultado1>resultado2) {
                    juego1++;
                }else{
                    juego2++;
                }
            }

            if (juego1<juego2) {
                sets1++;
                System.out.println("El resultado de este set es ("+juego1+"-"+juego2+"), lo gana "+_jugador1.getNombre()+". El total del partido es "+_jugador1.getNombre()+" "+sets1+"-"+sets2+" "+_jugador2.getNombre());
            }else{
                sets2++;
                System.out.println("El resultado de este set es ("+juego1+"-"+juego2+"), lo gana "+_jugador2.getNombre()+". El total del partido es "+_jugador1.getNombre()+" "+sets1+"-"+sets2+" "+_jugador2.getNombre());
            }

            juego1=juego2=0;

            if (sets1==6 || sets2==6 ) {
                System.out.println("Empate, se resetea el partido");
                sets1 = 0;
                sets2 = 0;
            }

        }

        if (sets1 > sets2) {
            _ganador=_jugador1;

        }else if (sets2>sets1) {
            _ganador=_jugador2;
        } 

        _ganador.setPuntosATP(_ganador.getPuntosATP()+1);

    	//Fin modificacion - ejercicio06() de la clase Apartado030202 -
        
            
    }
    
    /**
	 * Retorna el ganador. Si retorna null el partido todavia no se ha jugado
	 * 
	 * @return Retorna el ganador del partido
	 */  
    public Jugador ganador()
    {
       
        return _ganador;
    }
    
  
    
}