package pacoteExerciciosJava1;

import java.util.Scanner;

public class calculoTaxaJuros8 
{

	public static void main(String[] args) 
	{
		float preco, imposto, taxa, valorfinalimposto, valorfinaltaxa, valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o custo de fábrica do carro novo: "); 
		preco = leia.nextInt();
		
		//Valor do imposto 45%
		System.out.println("\nInsira o custo dos impostos: "); 
		imposto = leia.nextInt();
		
		//Valor distribuidor 28%
		System.out.println("\nInsira o custo do distribuidor: "); 
		taxa = leia.nextInt();
		
		valorfinalimposto = preco * imposto / 100;
		valorfinaltaxa = preco * taxa / 100;
		valortotal = preco + valorfinalimposto + valorfinaltaxa;
		
		System.out.println("\n===================================================================");
		System.out.printf("O valor do carro com todas as taxas e impostos é de %2.2f",valortotal); 
		System.out.println(" reais! ");
		System.out.println("===================================================================");
	}

}
