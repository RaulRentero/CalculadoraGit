package com.ejemplo.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		double a, b, total;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de A: ");
		a = sc.nextDouble();
		System.out.print("Valor de B: ");
		b = sc.nextDouble();
		System.out.println("1)Sumar 2) Restar 3) Multiplicar 4) Dividir");
		c = sc.nextInt();
		
		switch (c) {
		case 1: 
			System.out.println(sumar(a, b));
			break;
		case 2: 
			System.out.println(restar(a, b));
			break;
		case 3:
			System.out.println(multiplicar(a, b));
			break;
		case 4:
			System.out.println(dividir(a, b));
			break;
		default:
			System.out.println("Error");
		}
		total = sumar(a, b);
		
		System.out.println(total);
	}
	
	public static double sumar(double a, double b) {
		
		return a + b;
	}
	
	public static double restar(double a, double b) {
		
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		if (b == 0) {
			System.out.println("No se puede dividir entre cero");
		} else {
			return a / b;
		}
		
	}
}
