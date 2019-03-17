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
		int cuantosPerfectos = 0;

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
				cuantosPerfectos++;
			}
			numero ++;
		}		
		if (cuantosPerfectos == 0) {
			System.out.println("No hay numeros perfectos entre "+ n1 + " y " + n2);
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
        cheque=new Cheque("5500262222");   
        
       
         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque no es falso");
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
		cabecera("03", "Triangulo, cuadrado y cuadrado relleno");

		// Inicio modificacion

		int tamanio;

		System.out.println("Introduzca el tamanio");
		tamanio = Teclado.readInteger();

		//triangulo

		System.out.println("Triangulo");

		for (int i = 1; i <= tamanio; i++) {
			
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		//cuadrado relleno

		System.out.println("");
		System.out.println("Cuadrado relleno");

		int contadorCuadradoRelleno = 0;

		do{
				
			for (int i =1; i <= tamanio; i++) {
				System.out.print("*");
			}

			System.out.println();
			contadorCuadradoRelleno++;

		}while(contadorCuadradoRelleno < tamanio );

		//caudrado vacio

		System.out.println("");
		System.out.println("Cuadrado vacio");

		int contadorCuadradoVacio = 0;

		do{
			
			if (contadorCuadradoVacio != 0 && contadorCuadradoVacio != tamanio-1) {
				System.out.print("*");
				for (int i = 2; i <= tamanio-1; i++) {
					
					System.out.print(" ");
				}					
				System.out.print("*");
			}else{
				
				for (int i =1; i <= tamanio; i++) {
					
					System.out.print("*");
				}
			}

			System.out.println();
			contadorCuadradoVacio++;

		}while(contadorCuadradoVacio < tamanio);

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
		cabecera("04", "Juego");

		// Inicio modificacion

		int opcion;
		int numeroParaAveriguar;
		int numeroIntentos = 0;
		int numeroDado = -1; /*Lo inicializo a -1 ya que esta fuera del rango del numero
		 aleatorio y no hay posibilidad de que se rompa el bucle while de los inentos*/

		do{

			numeroParaAveriguar = (int) (Math.random() * 100);
			numeroIntentos = 0;
			numeroDado = -1;
			System.out.println(numeroParaAveriguar);

			for (int i = 0; i < 4; i++) {
				System.out.println();
			}
			System.out.println("Welcome to 'GUESS THE NUMBER'");
			System.out.println("Instrucciones:");
			System.out.println();
			System.out.println("El ordenador pensara un numero entre 1 y 100");
			System.out.println("El usuario dispondra de 5 intentos para acertar el numero.");
			System.out.println("Por cada intento se indicara si el numero buscado es menor o mayor al introducido y si ha acertado.");
			System.out.println();
			System.out.println("Suerte!");
			System.out.println();

			while(numeroIntentos < 5 && numeroDado != numeroParaAveriguar){

				numeroDado = Teclado.readInteger();

				if (numeroDado > numeroParaAveriguar) {
					
					System.out.println("El numero que buscas es menor a "+numeroDado);		
				}else if(numeroDado < numeroParaAveriguar){
					System.out.println("El numero que buscas es mayor a "+numeroDado);
				}	

				numeroIntentos++;
			} 

			if (numeroIntentos <= 5) {
				System.out.println("Enhorabuena! Has acertado en el intento numero "+numeroIntentos);
			}else{
				System.out.println("Lastima... Game Over");
			}


			do{
				System.out.println();
				System.out.println("¿Quieres reiniciar el juego?");
				System.out.println("[1] Reiniciar");
				System.out.println("[2] Salir");
				opcion = Teclado.readInteger();

				if (opcion != 1 && opcion !=2) {
					System.out.println("Opcion incorrecta");
				}

			}while(opcion != 1 && opcion != 2);

		}while(opcion == 1);

		System.out.println("Gracias por jugar!");

		// Fin modificacion
	}
}
