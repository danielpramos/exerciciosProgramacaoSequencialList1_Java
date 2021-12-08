package pacoteExerciciosJava1;

import java.util.Scanner;

public class calculoMediaPonderada5 
{

	public static void main(String[] args) 
	{
		
		double nota1,nota2,nota3,mediaPonderada;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.printf("\n==========================================");
		System.out.printf("\nA média ponderada é de: %2.2f ",mediaPonderada);
		System.out.printf("\n===========================================");		
				

	}

}