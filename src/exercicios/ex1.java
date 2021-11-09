package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int a,b,c,maior=-999999;
		System.out.println("1° numero: ");
		a=leia.nextInt();
		if (a>maior)
		{
			maior=a;
		}
		System.out.println("2° numero: ");
		b= leia.nextInt();
		if (b>maior)
		{
			maior=b;
		}
		System.out.println("3° numero: ");
		c= leia.nextInt();
		if (c>maior)
		{
			maior=c;
		}
		leia.close();
		System.out.println("\nO maior numero é: "+ maior);

	}

}
