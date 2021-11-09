package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		int a;
		double r,q;
		System.out.println("Digite o numero: ");
		a=leia.nextInt();
		if(a%2==0)
		{
			System.out.println("\nO numero é Par");
			r=Math.sqrt(a);
			System.out.println("\nSua raiz é: "+ r);
		}
		if(a%2!=0)
		{
			System.out.println("\nO numero é Impar");
			q=Math.pow(a, 2);
			System.out.println("\nSeu quadrado é: "+q);
		}
		leia.close();

	}

}
