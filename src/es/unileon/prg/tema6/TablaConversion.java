package es.unileon.prg.tema6;

/** Clase que representa una tabla de conversion de grados Celsius a Fahrenheit
 * @author PRG 
 * @version (1.0)
 */


public class TablaConversion
{
	/**
	 * Columnas de la tabla
	 */
    private int columnas;
    /**
	 * Filas o lineas de la tabla
	 */
    private int lineas;
    /**
     * Separador entre elemetos de la tabla
     */
    final String SEPARADOR = "\t";
    
    /**
	 * Constructor
	 * @param columnas
	 * 	Numero de columnas de la tabla
	 * @param lineas
	 * 	Numero de lineas de la tabla
	 */

    public TablaConversion(int columnas, int lineas)
    {
        this.columnas = columnas;
        this.lineas = lineas;
    }
        
    /**
    *  Imprime una tabla de conversion de grados Celsius a Fahrenheit
    */
    public void imprimir()
    {

        System.out.println("Tabla de conversion de temperaturas de grados Celsius a grados Farenhait");
        System.out.println();
       
        // Imprimir cabecera
        //Inicio modificacion del ejercicio10 del Apartado030201

        StringBuffer cabecera = new StringBuffer();

        if (this.columnas%2!=0) {
            this.columnas=this.columnas+1;
        }

        for (int i = 0; i < this.columnas; i++) {
            
            if (i%2==0) {
                cabecera.append('C');
                cabecera.append(SEPARADOR);   
            }else{
                cabecera.append('F');
                cabecera.append(SEPARADOR);  
            }
        }
            System.out.println(cabecera);
            System.out.println();
        
        
        //Fin modificacion del ejercicio10 del Apartado030201
        
        // Imprimir cada linea  
        for (int i = 0; i < this.lineas; i++)
            imprimirLinea(i);
         
     }


    /**
     * Imprime una linea de la tabla de conversion de grados Celsiuis a
     * Fahrenheit, utilizando la informacion dada por el numero de
     * linea actual
     * @param estaLinea Numero de la linea a imprimir
     * 
     * */
     public void imprimirLinea(int estaLinea)
     {
         int c; // temperatura en celsius
         int f; // temperatura en fahrenheit
         //Inicio modificacion del ejercicio10 del Apartado030201

         StringBuffer fila = new StringBuffer();

         if (estaLinea==0) {
             c=0;
         }else{
            c = ((this.columnas/2)*estaLinea);
         }

         for (int i=0; i<this.columnas/2 ; i++) {

             f=fahrenheit(c);

             fila.append(c);
             fila.append(SEPARADOR);
             fila.append(f);
             fila.append(SEPARADOR);

             c++;
         }
         
         //Fin modificacion del ejercicio10 del Apartado030201
                  
         System.out.println(fila);
     }


    /**
     * Transforma una temperatura dada en grados celsius a
     * fahrenheit
     * @param celsius Temperatura en grados Celsiuis
     * @return Temperatura en grados Fahrenheit
     */
     public int fahrenheit(int celsius)
     {
         return (int)((celsius * 1.8) + 32);
     }
}