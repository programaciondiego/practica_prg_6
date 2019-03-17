package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","Numeros perfectos");

		// Inicio modificacion

		int n1;
		int n2;
		int numero = 0 ;
		int cambiador = 0;
		int divisor = 0;
		int sumaDivisores = 0;
		int contador = 1;

		System.out.println("Introduzca un numero");
		n1 = Teclado.readInteger();
		System.out.println("Introduzca un numero");
		n2 = Teclado.readInteger();

		if (n2>n1) {
			cambiador = n1;
			n1 = n2;
			n2 = cambiador;
		}

		numero = n2+1;

		for (int i = n2+1; i<n1 ; i++ ) {

			sumaDivisores = 0;
			contador = divisor = 1;

			do{
				if ( (numero % divisor) == 0 ) {
					sumaDivisores = sumaDivisores + divisor;
				}
				contador++;
				divisor++;

			}while(contador < numero);

			if (sumaDivisores == numero) {
				System.out.println();
				System.out.println(numero + " es un numero perfecto");
			}
			numero ++;
		}		

        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "Comprabante de cheques");

		Cheque cheque=null;
		
		//Modificar el numero de cheque para probar
		//cheque=new Cheque("1000988887");    
        //cheque=new Cheque("1010098888");
        //cheque=new Cheque("1009808880");   
        
       
         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("Elche no es falso");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 *  ****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		// Fin modificacion
	}
}
