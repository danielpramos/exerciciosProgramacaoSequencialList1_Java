package pacoteExerciciosJava1;

import java.util.Scanner;

public class exercicioIdadeAnosDias1 
{
	public static void main(String[] args) 
	{   
		int dias, meses, idade, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite quantos anos voc� tem: ");
		idade = leia.nextInt();
		
		System.out.println("\nDigite quantos meses voc� tem: ");
		meses = leia.nextInt();
		
		System.out.println("\nDigite quantos dias voc� tem: ");
		dias = leia.nextInt();
		
		totalDias = idade * 365 + meses * 30 + dias;
				
		System.out.println("\nVoc� tem " + totalDias + " dias de idade.");		
				
	}
}
