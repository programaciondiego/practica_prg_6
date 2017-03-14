package es.unileon.prg.tema6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TecladoBasico{
    
    /**
     * Lee una linea por consola.
     *
     *
     * @return String Una linea con el comando.
     */
    public static String leerLinea() {
        String linea="";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            linea = br.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        
        return linea;
    }
    
}
