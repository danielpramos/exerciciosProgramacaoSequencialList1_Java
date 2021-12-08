package pacoteExerciciosJava1;

import java.util.Scanner;

public class segundosHorasMinutosSegundos3 {

	public static void main(String[] args) 
	{
		int segundos, minutos, horas;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade em dias: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println("\nO evento da fábrica durará  " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)!");

	}

}
