package pacoteExerciciosJava1;

import java.util.Scanner;

public class equacaoValorX_Y7 
{
	
	public static void main(String[] args) 
	{
		double A, B, C, D, E, F, X, Y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o coeficiente  A: "); 
		A = leia.nextInt();
		
		System.out.println("\nEscreva o coeficiente  B: "); 
		B = leia.nextInt();
		
		System.out.println("\nEscreva o coeficiente  C: "); 
		C = leia.nextInt();
		
		System.out.println("\nEscreva o coeficiente  D: "); 
		D = leia.nextInt();
		
		System.out.println("\nEscreva o coeficiente  E: "); 
		E = leia.nextInt();
		
		System.out.println("\nEscreva o coeficiente  F: "); 
		F = leia.nextInt();
		
		X = ((C * E) - (B * F)) / ((A * E) - (B * D));
		Y = ((A * F) - (C * D)) / ((A * E) - (B * D));
		
		System.out.println("\n===============================================");
		System.out.printf("O valor de X é %2.2f", X);
		System.out.printf(" e o de Y é %2.2f",Y);
		System.out.println("\n===============================================");
	}

}
