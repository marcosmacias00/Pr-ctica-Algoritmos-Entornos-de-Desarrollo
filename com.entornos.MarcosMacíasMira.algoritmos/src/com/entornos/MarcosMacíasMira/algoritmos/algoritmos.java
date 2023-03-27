package com.entornos.MarcosMacíasMira.algoritmos;
/**
 * 
 * 
 * @author Marcos
 * Version 1.0
 * Esta clase sirve para calcular números fibonacci
 */
public abstract class algoritmos {
	/**
	 * 
	 * Recibe un numero entero y devuelve un numero fibonacci
	 * @param posicion 
	 * @return numero fibonacci del numero entero
	 */
	public static int fibonacci(int posicion) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int y = 1; y <= posicion; y++) {
			// Si no quieres imprimirla, comenta la siguiente línea:
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		// Si no quieres imprimirla, comenta la siguiente línea:
		return actual;
	}


	/**
	 * 
	 * Recibe un numero entero y devuelve un numero factorial
	 * @param posicion 
	 * @return numero factorial del numero entero
	 */
	public int factorial (int numero) {
	  if (numero==0) {
	    return 1;
	  }else { 
	    return numero * factorial(numero-1);
		}
	}
	
	/**
	 * 
	 * Recibe un numero entero y devuelve un numero primo
	 * @param posicion 
	 * @return numero primo del numero entero
	 */
	public static boolean Primo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
}