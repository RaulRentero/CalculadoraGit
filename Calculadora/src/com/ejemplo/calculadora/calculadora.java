package com.ejemplo.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		double a, b, total;
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de A: ");
		a = sc.nextDouble();
		System.out.print("Valor de B: ");
		b = sc.nextDouble();
		
		total = sumar(a, b);
		
		System.out.println(total);
	}
	
	public static double sumar(double a, double b) {
		
		return a + b;
	}
}
