package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramArray
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Example 1
		int n = sc.nextInt();
		
		double[] heights = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++)
		{
			heights[i] = sc.nextDouble();
			sum += heights[i];
		}
		
		System.out.printf("AVERAGE HEIGHT = " + String.format("%.2f", (sum/n)));
		*/
		
		// Example 2
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		double sum = 0;
		for(int i = 0; i < products.length; i++)
		{
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			Product p = new Product(name, price);
			products[i] = p;
			sum += products[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = " + String.format("%.2f", (sum/products.length)));
		
		sc.close();
	}

}
