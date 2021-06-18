package pratica1;

import java.util.Locale;
import java.util.Scanner;

	/* 1) Em linguagem de programação Java, escreva um algoritmo que calcule e apresente a
	área de um losango. As diagonais maior e menor do losango devem ser informadas pelo
	usuário. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.
	*/

public class Exercicio1 { 	

    public static void main(String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double area, dMa, dMe ;
        
        System.out.println("Digite o valor do lado Diagonal Maior: ");
        dMa = sc.nextDouble();
        
        System.out.println("Digite o valor do lado Diagonal Menor: ");
        dMe = sc.nextDouble();
        
        area = (dMa * dMe) /2;
        
        System.out.println("A área do losango: " + area );
        
        sc.close();
    }
}