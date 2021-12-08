package pacoteExerciciosJava1;

import java.util.Scanner;

public class somaDistanciaX_Y6 
{

	public static void main(String[] args) 
	{
		double x1, y1, x2, y2, distancia1, distancia2, somadistancia, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de x1: ");
		x1= leia.nextFloat();
		
		System.out.println("Digite o valor de y1: ");
		y1= leia.nextFloat();
		
		System.out.println("Digite o valor de x2: ");
		x2= leia.nextFloat();
		
		System.out.println("Digite o valor de y2: ");
		y2= leia.nextFloat();
		
		distancia1 = Math.pow(x2 - x1, 2) ;        //(x2 - x1) * (x2 - x1);
		distancia2 = Math.pow(y2 - y1, 2);         //(y2 - y1) * (y2 - y1);
		somadistancia = distancia1 + distancia2;
		D = Math.sqrt(somadistancia);
		
		System.out.println("\n===============================================");
		System.out.printf("A distância entre eles é de: %2.2f ", D);
		System.out.println("\n===============================================");
		

	}

}
