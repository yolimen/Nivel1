package com.Sophos.Automatizacion.Nivel1.Fibonacci;

public class SucesionFibonacci {

	public int fibonacciRecursivo(int n) {
		if(n==1 || n==2) {
			return 1;
		} else {
			return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }
  }
	
	/* Mediante ciclo */
	
	public int fibonacciCiclo(int n) {
		int fibo = 0, primero = 1, segundo =0;
		while (n > 0) {
			fibo = primero + segundo;
			primero = segundo;
			segundo = fibo;
			n--;
		}
		return fibo;
	}
}