package pacoteExerciciosJava1;

import java.util.Scanner;

public class resultadoCalculoExpressao4 
{

	public static void main(String[] args) 
	{
		int A, B, C, D, R, S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: "); 
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (int) Math.pow(A + B, 2);
		S = (int) Math.pow(B + C, 2);
		D = (R + S) / 2;
			
		System.out.println("\nO valor da express�o D = R + S / 2 �: " + D);
	}

}
