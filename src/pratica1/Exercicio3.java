package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 3) Em linguagem de programa��o Java, escreva um algoritmo que receba o valor do sal�rio
	m�nimo e o valor do sal�rio de um funcion�rio. O algoritmo deve calcular e apresentar a
	quantidade de sal�rios m�nimos que esse funcion�rio recebe.
	*/

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	        
	     	System.out.println("Informe o valor do sal�rio m�nimo: ");
	     	double salarioM = 1100;
	    		   
	        System.out.println("Informe o sal�rio do funcion�rio: ");
	        double salarioF = sc.nextDouble();
	        
	        double result = salarioF / salarioM;
	        
	        System.out.printf("O funcion�rio recebe %.2f s�rios m�nimos", result);
	  
			sc.close();
			
	}

}
