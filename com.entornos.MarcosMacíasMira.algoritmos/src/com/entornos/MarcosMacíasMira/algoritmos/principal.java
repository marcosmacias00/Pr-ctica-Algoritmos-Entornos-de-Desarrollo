package com.entornos.MarcosMacíasMira.algoritmos;

public class principal {
	public static void main(String[] args) {
		int numero [] = new int[5];
		int resultadoFibonacci[]= new int [5];
		int resultadoFactorial[]= new int [5];
		boolean resultadoPrimo[]= new boolean [5];
		for(int i=0; i<numero.length; i++) {
			numero[i]= (int)(Math.random()*20+1);
		}
		for(int i=0; i<numero.length;i++) {
			resultadoFibonacci[i]= Algoritmo.fibonacci(numero[i]);
		}
		for(int i=0;i<numero.length;i++) {
			resultadoFactorial[i]=Algoritmo.factorial(numero[i]);
		}
		for(int i=0;i<numero.length;i++) {
			resultadoPrimo[i]=Algoritmo.Primo(numero[i]);
		}
	}
	

}
