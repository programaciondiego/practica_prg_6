package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","Calificacion nota");

		// Inicio modificacion

		int nota;

		System.out.println("Porfavor, introduzca la calificacion del alumno");

		nota = Teclado.readInteger();

		switch(nota){

			case 1://next 
			case 2://next
			case 3://next
			case 4:
				System.out.println("Insuficiente");
				break;

			case 5:
				System.out.println("Suficiente");
				break;

			case 6:
				System.out.println("Bien");
				break;

			case 7://next
			case 8:
				System.out.println("Notable");
				break;

			case 9:
				System.out.println("Sobresaliente");
				break;	

			case 10:
				System.out.println("Matricula");
				break;	

			default:
				System.out.println("La nota introducida no esta entre el 1 y el 10");

		}

        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "Anillos");

		// Inicio modificacion

		System.out.println("Introduce otro numero");
		int n = Teclado.readInteger();

		switch (n) {

			case 6:
			case 9:
				System.out.println(n+" tiene 1 anillo");
			break;

			case 8:
				System.out.println(n+" tiene 2 anillos");
			break;

			default:
				System.out.println(n+" no tiene anillos");	

		}

		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "Sumar, multiplicar, divisores con switch");

		// Inicio modificacion

		System.out.println("Introduce un numero");
		int n1 = Teclado.readInteger();

		System.out.println("Introduce otro numero");
		int n2 = Teclado.readInteger();

		System.out.println("¿Que quieres hacer?");
		System.out.println("[1] - Sumar");
		System.out.println("[2] - Multiplicar");
		System.out.println("[3] - Divisores");

		int respuesta = Teclado.readInteger();

		switch (respuesta) {
			
			case 1:

					int suma = n1+n2;
					System.out.println("La suma de los numeros es: " + suma);

				break;

			case 2:

					int multiplicacion = n1*n2;
					System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

				break;

			case 3:

					if (n1%n2==0) {
						System.out.println(n1+" es divisble por "+n2);
					}

					if (n2%n1==0) {
						System.out.println(n2+" es divisble por "+n1);
					}
					else{
						System.out.println("Los numeros dados no son divisbles entre si.");
					}

				break;

			default:
				System.out.println("Opcion incorrecta");

		}

		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "Vocal mayuscula / minuscula");

		// Inicio modificacion

		System.out.println("Introduce una cadena de caracteres");
		String cadena;
		char caracter;

		cadena = Teclado.readString();

		caracter = cadena.charAt(0);

		switch(caracter){

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("El primer caracter de la cadena '" + cadena + "' es una vocal minuscula");
				break;

			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("El primer caracter de la cadena '" + cadena + "' es una vocal mayuscula");
				break;

			default:
				System.out.println("El primer caracter de la cadena '" + cadena + "' no es una vocal");


		}


		// Fin modificacion
	}
}
