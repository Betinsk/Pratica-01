package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 2) Em linguagem de programação Java, escreva um algoritmo que receba uma temperatura
	em Celsius, calcule e mostre essa temperatura em Fahrenheit. OBS: F = (C * 1,8) + 32.
	*/

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		  Scanner sc  = new Scanner(System.in);
	 
	        System.out.println("Informe a temperatura em graus Celsius: ");
	        double c = sc.nextDouble();
	        
	        System.out.println("A temperatura em Fahrenheit: "+ (c * 1.8 + 32));
	        
	        sc.close();
	        
	    }
	}

