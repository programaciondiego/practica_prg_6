package es.unileon.prg.tema6;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * Clase de prueba de las practicas de PRG
 *
 * @author PRG
 * @version 1.0
 */
public class PruebaPractica {

	private static String CLASE = "es.unileon.prg.tema6.Apartado";
	private static String METODO = "ejercicio";

	/**
	 * Metodo principal de la aplicacion
	 *
	 */
	public static void main(String[] args) {
        System.out.println("Introduzca el apartado: ");
        String linea = TecladoBasico.leerLinea();
        String nombreClase = CLASE + linea;
        
        System.out.println("Introduzca el ejercicio: ");
        linea = TecladoBasico.leerLinea();
        String nombreMetodo = METODO + linea;
        
        try {
            Class<?> clase = Class.forName(nombreClase);
            Method metodo = clase.getMethod(nombreMetodo);
            metodo.invoke(clase.newInstance());
        } catch (ClassNotFoundException classNotFound) {
            System.out.println();
            System.out.println("Codigo de apartado incorrecto. Por favor, revise el enunciado de la practica");
            System.out.println();
        } catch (InvocationTargetException invocation) {
            System.out.println();
            invocation.printStackTrace();
            System.out.println();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Numero de ejercicio incorrecto. Por favor, revise el enunciado de la practica");
            System.out.println();
        }
    }
}
