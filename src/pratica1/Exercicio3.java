package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 3) Em linguagem de programação Java, escreva um algoritmo que receba o valor do salário
	mínimo e o valor do salário de um funcionário. O algoritmo deve calcular e apresentar a
	quantidade de salários mínimos que esse funcionário recebe.
	*/

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	        
	     	System.out.println("Informe o valor do salário mínimo: ");
	     	double salarioM = 1100;
	    		   
	        System.out.println("Informe o salário do funcionário: ");
	        double salarioF = sc.nextDouble();
	        
	        double result = salarioF / salarioM;
	        
	        System.out.printf("O funcionário recebe %.2f sários mínimos", result);
	  
			sc.close();
			
	}

}
