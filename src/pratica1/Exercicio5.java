package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 5) Em linguagem de programação Java, escreva um algoritmo que receba o raio, calcule e
	apresente:
	a. O comprimento de uma esfera: C = 2 * π * R.
	b. A área de uma esfera: A = π * R2
	c. O volume de uma esfera: V = ¾ * π * R3
	.
	*/

public class Exercicio5 {
 
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
       
         System.out.println("Digite o valor do Raio: ");
         double raio = sc.nextDouble();
     
         System.out.printf("O comprimento da esfera é: %.2f%n", (2 * 3.14 * raio));
         System.out.printf("A área da esfera é: %.2f%n" , (3.14 * Math.pow(raio ,2)));
         System.out.printf("O volume da esfera é: %.2f%n" ,((4 * 3.14 * Math.pow(raio ,2)) / 3));

         sc.close();
	}

}
