package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 4) Em linguagem de programa��o Java, escreva um algoritmo que receba os valores dos
	dois catetos de um tri�ngulo, calcule e apresente o valor da hipotenusa. OBS - Teorema
	de Pit�goras: a2 = b2 + c2.
	*/
public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
	 
	        System.out.println("Calculadora de Hipotenusa");
	        
	        System.out.println("Insira o valor do 1� cateto: ");
	        double cat1 = sc.nextDouble();
	        System.out.println("Insira o valor do 2� cateto: ");
	        double cat2 = sc.nextDouble();
	        double hipotenusa = Math.sqrt(Math.pow(cat1, 2)+ Math.pow(cat2, 2));
	        
	        System.out.printf("O valor da Hipotenusa catetos �: %.2f " , hipotenusa);
	        
	    	sc.close();
	    }

	}
