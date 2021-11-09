package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		int a;
		System.out.println("Qual a sua idade: ");
		a=leia.nextInt();
		if (a>=10 && a<=25)
		{
			
		if (a>=10 && a<=14)
		{
			System.out.println("\nCategoria Infantil");
		}
		if (a>=15 && a<=17)
		{
			System.out.println("\nCategoria Juvenil");
		}
		if (a>=18 && a<=25)
		{
			System.out.println("\nCategoria Adulto");
		}
		}
		else
		{
			System.out.println("\nIdade Inválida");
		}
		leia.close();

	}

}
