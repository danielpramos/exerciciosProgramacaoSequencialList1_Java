package pacoteExerciciosJava1;

import java.util.Scanner;

public class exercicioIdadeDiasAnos2 {

	public static void main(String[] args) 
	{
		int idade, mes, anos, dias, dia ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("Você tem " + anos + " anos, " + mes + " meses e " + dia + " dias de idade.");

	}

}
