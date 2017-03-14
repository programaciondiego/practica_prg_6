package es.unileon.prg.tema6;
/**
 * Clase comun a las clases a completar.
 *
 * @author PRG
 * @version 1.0
 */
public abstract class Apartado {

	/**
	 * Muestra un mensaje de cabecera por pantalla que indica el metodo
	 * ejecutado.
	 *
	 * @param bloque
	 * @param ejercicio
	 */
	protected void cabecera(String ejercicio, String descripcion) {
		System.out.println();
		System.out.println();
		System.out.println("Practica "+obtenerPractica());
		System.out.println();
		System.out.println("Bloque: " + obtenerBloque());
		System.out.println("Ejercicio: " + ejercicio);
		System.out.println();
		System.out.println("Descripcion: " + descripcion);
		System.out.println();
		System.out.println();
	}

	/**
	 * Recupera el nombre de la practica
	 *
	 * @return El nombre de la practica.
	 */
	protected abstract String obtenerPractica();

	/**
	 * Recupera la denominacion del bloque.
	 *
	 * @return La denominacion del bloque
	 */
	protected abstract String obtenerBloque();
}
