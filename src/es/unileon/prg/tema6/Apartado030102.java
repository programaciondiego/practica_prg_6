package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instruccion "if-else".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion if-else";
	}

	/**
	 * Instruccion if-else - Ejercicio1.
	 *
	 * </br>
	 *
	 * Realizar las modificaciones necesarias para que al ejecutar el metodo se ofrezca 
	 * al usuario la posibilidad de obtener el area o el perimetro del rectangulo.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","Seleccion de opciones");

		Rectangulo rectangulo=new Rectangulo(10,5);
		System.out.println("Introduce una opcion (1 - Area, 2 - Perimetro):");
		// Inicio modificacion
        
        int opcionSelecionada = Teclado.readInteger();

        if (opcionSelecionada==1) {
        	System.out.println(rectangulo.getArea());
        }else{
        	System.out.println(rectangulo.getPerimetro());
        }
		
		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio2.
	 *
	 *  Realizar las modificaciones necesarias para que al ejecutar el metodo  se ofrezca al 
	 *  usuario la posibilidad de introducir un anio por el teclado y se le diga si es un anio bisiesto o no.
	 *  Un anio es bisiesto si es multiplo de 400 o si es multiplo de 4 sin serlo de 100
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "Bisiesto no bisiesto");
		// Inicio modificacion
		
		System.out.println("Introduce un año");

		int anyo = Teclado.readInteger();

		if (anyo%400==0 || (anyo%4==0 && anyo%100!=0)) {
			System.out.println(anyo + " es un año bisiesto");
		}else {
			System.out.println(anyo + " no es un año bisiesto");
		}

		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio3.
	 *
	 * Se pide
	 * 
	 * <ul>
	 * <li> Quitar los comentarios indicados y compilar  el metodo 02.
	 * <li> Identificar los errores de compilacion.
	 * <li> Explicar en el fichero LEEME.TXT los errores existentes.
	 * <li> Implementar el metodo int compareTo(NumeroEntero n) de la clase NumeroEntero de forma que:
	 * <ul>
	 * <li>	retorne -1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es menor que  el valor del numero n.
	 * <li> retorne 0 si el valor de los dos objetos NumeroEntero son iguales.
	 * <li> retorne 1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es mayor que  el valor del numero n.
	 * </ul>
	 * <li> Modificar el  metodo realizando las comparaciones entre los numeros usando  el metodo compareTo.
	 * <li> Compilar y ejecutar el metodo y analizar los resultados obtenidos.
	 * </ul>
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "Comparar numeros");

        // Inicio modificacion
		
        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(10);

        if (n1.comapreTo(n2) == -1){
        	 System.out.println("N1-> "+n1);
             System.out.println("N1 es mayor que N2");
        }
        else if (n1.comapreTo(n2) ==1) {
            System.out.println("N1 -> "+n1);
            System.out.println("N1 es menor que N2");
        }
        else{
           System.out.println("N1 y N2 son iguales -> N1 ->"+n1+" N2 -> "+n2);
        }

		// Fin modificacion
		
	}

	/**
	 * Instruccion if-else - Ejercicio4.
	 *
	 * </br>
	 *
	 * 
	 * Modificar el metodo para que al ejecutarlo se le pida al usuario que introduzca dos numeros 
	 * y a continuacion se le ofrezcan las siguientes opciones:
	 * <ul>
	 * <li>	1 - Sumar: Se mostrara por pantalla la suma de los numeros
	 * <li> 2 - Multiplicar:Se mostrara por pantalla la multiplicacion de los dos numeros
	 * <li> 3 - Divisores:	Se mostrara por pantalla: si el primero es divisor del segundo, si el segundo es divisor del primero o si ninguno es divisor del otro.
	 *  		Si no introduce ninguna de las opciones se mostrara el mensaje : Opcion incorrecta
	 *  </ul>
	 *  	 
	 */
	public void ejercicio04() {
		cabecera("04", "Suma, multiplicar, divisores");

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

		if (respuesta == 1) {

			int suma = n1+n2;
			System.out.println("La suma de los numeros es: " + suma);

		}else if (respuesta == 2) {

			int multiplicacion = n1*n2;
			System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

		}else if (respuesta == 3) {
		
			if (n1%n2==0) {
				System.out.println(n1+" es divisble por "+n2);
			}

			if (n2%n1==0) {
				System.out.println(n2+" es divisble por "+n1);
			}
			else{
				System.out.println("Los numeros dados no son divisbles entre si.");
			}

		}else{

			System.out.println("Opcion incorrecta");

		}
		
        // Fin modificacion
	}
	/**
	 * Instruccion if-else - Ejercicio5.
	 *
	 * Crear una clase denominada Ecuacion2Grado que tenga como atributos los coeficientes de 
	 * una ecuacion de segundo grado (a,b,c)  (ax2 +bx +c=0). Definir e implementar los siguientes metodos
	 * <ul>
	 * <li>	Un constructor que reciba los tres coeficientes de la ecuacion que se va a crear (a,b,c)
	 * <li>	Tres metodos get para cada uno de sus atributos.
	 * <li> Un metodo numeroDeSoluciones que retorne el numero de  soluciones de la ecuacion.
	 * <li> El metodo String toString() que retorne un String representativo de la ecuacion indicando el numero de soluciones que tiene 
	 * 		y el valor para cada una de las soluciones que tenga.
	 * </ul>
	 * 
	 * Probar la clase realizando las modificaciones necesarias y ejecutando el metodo ejercicio5().
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","");

		int a=2, b=5, c=1; //Modificar los valores para realizar pruebas o leerlos por teclado
		
		// Ecuacion2Grado ecuacion=new Ecuacion2Grado(a,b,c);
		// Inicio modificacion

		System.out.println("Introduce el numero que multiplica a x²");
		a = Teclado.readInteger();
		System.out.println("Introduce el numero que multiplica a x");
		b = Teclado.readInteger();
		System.out.println("Introduce el termino independiente");
		c = Teclado.readInteger();

		Ecuacion2Grado ecuacion = new Ecuacion2Grado(a,b,c);

		System.out.println(ecuacion);

        // Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio6.
	 *
	 * Modificar el metodo  para que al ejecutarlo se le pida al usuario que introduzca tres numeros  
	 * y se indique cual es el mayor de los tres. Tambien se informara si hay dos o tres numeros iguales
	 * y cuales son. 
	 *
	 */
	public void ejercicio06() {
		cabecera("06", "Numero mayor");

		// Inicio modificacion

		System.out.println("Por favor, introduzca un numero");
		int n1 = Teclado.readInteger();
		System.out.println("Por favor, introduzca otro numero");
		int n2 = Teclado.readInteger();
		System.out.println("Por favor, introduzca otro numero");
		int n3 = Teclado.readInteger();

		StringBuffer salida = new StringBuffer();

		int mayor = n1;

		if (n1==n2&&n2==n3) {
			salida.append("Los tres numeros son "+n2+", y son iguales.  ");
		}else{
			if (n1==n2) {
			salida.append("El numero "+n1+" esta repetido 2 veces  ");
			}else if (n2==n3) {
			salida.append("El numero "+n2+" esta repetido 2 veces  ");
			}else if (n1==n3) {
			salida.append("El numero "+n3+" esta repetido 2 veces  ");
			}
		}

		if (mayor < n2) {
		mayor = n2;
		}else if(mayor < n3){
			mayor = n3;
		}
		salida.append("El numero dado mas grande es "+mayor+".");

		System.out.println(salida.toString());

		// Fin modificacion
	}
}
