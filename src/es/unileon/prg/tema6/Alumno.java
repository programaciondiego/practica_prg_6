package es.unileon.prg.tema6;
/**
 * Clase que representa un alumno.
 * 
 * @author PRG
 * @version 1.0
 */
public class Alumno {
	/**
	 * Identificador del alumno
	 * 
	 * @see String
	 */
	private String _niu;
	/**
	 * Nombre del alumno
	 * 
	 * @see String
	 */
	private String _nombre;
	/**
	 * Nota del alumno
	 */
	private float _nota;

	/**
	 * Constructor de la clase. Crea un alumno con la informacion recibida
	 * 
	 * @param niu
	 *            Identificador del alumno
	 * @param nombre
	 *            Nombre del alumno
	 */
	public Alumno(String niu, String nombre) {
		_niu = niu;
		_nombre = nombre;
	}

	/**
	 * Asigna la calificacion del alumno
	 * 
	 * @param nota
	 *            Nota del alumno
	 */
	public void asignarNota(float nota) {
		_nota = nota;
	}

	
	
	//Inicio modificacion Apartado 030101 - ejercicio01
	
	
	//Fin modificacion Apartado 030101 - ejercicio01
	
	
	
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("NIU: "+_niu+" ");
		salida.append("Nombre: "+_nombre+" ");
		salida.append("Nota: "+_nota+" ");
		
		return salida.toString();
	}
	
}
