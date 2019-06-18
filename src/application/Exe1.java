package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangule;

public class Exe1
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Retangule ret = new Retangule();
		ret.setHeight(sc.nextDouble());
		ret.setWidth(sc.nextDouble());
		
		System.out.println("AREA = " + String.format("%.2f", ret.getArea()));
		System.out.println("PERIMETER = " + String.format("%.2f", ret.getPerimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", ret.getDiagonal()));
		
		sc.close();
	}

}
