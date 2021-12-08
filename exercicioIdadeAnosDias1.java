package pacoteExerciciosJava1;

import java.util.Scanner;

public class exercicioIdadeAnosDias1 
{
	public static void main(String[] args) 
	{   
		int dias, meses, idade, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite quantos anos você tem: ");
		idade = leia.nextInt();
		
		System.out.println("\nDigite quantos meses você tem: ");
		meses = leia.nextInt();
		
		System.out.println("\nDigite quantos dias você tem: ");
		dias = leia.nextInt();
		
		totalDias = idade * 365 + meses * 30 + dias;
				
		System.out.println("\nVocê tem " + totalDias + " dias de idade.");		
				
	}
}
