package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		double a,b,c,x1=0,x2=0,x3=0;
		System.out.println("1°numero: ");
		a=leia.nextDouble();
		System.out.println("2° numero: ");
		b=leia.nextDouble();
		System.out.println("3° numero: ");
		c=leia.nextDouble();
		x1=a;
		x2=a;
		x3=a;
		if (a>b && a>c)
		{
			x3=a;
			if (b>=c)
			{
				x2=b;
				x1=c;
			}
			if (b<=c)
			{
				x1=b;
				x2=c;
			}
		}
		if ((a>=b && a<c) || (a<b && a>=c))
		{
			x2=a;
			if (b>c)
			{
				x3=b;
				x1=c;
			}
			if (b<c)
			{
				x1=b;
				x3=c;
			}
		}
		if (a<=b && a<=c)
		{
			x1=a;
			if (b>=c)
			{
				x3=b;
				x2=c;
			}
			if (b<=c)
			{
				x2=b;
				x3=c;
			}
		}
		System.out.println("\nOrdem: "+ x1+"  "+ x2+"  "+ x3);
		leia.close();
		
	}

}
