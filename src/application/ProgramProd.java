package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProd;
import entities.Prod;
import entities.UsedProd;

public class ProgramProd
{

	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int numProd = sc.nextInt();
		
		List<Prod> prods = new ArrayList<>();
		for(int i = 1; i <= numProd; i++)
		{
			sc.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'c')
			{
				prods.add(new Prod(name, price));
			}
			else if(type == 'i')
			{
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prods.add(new ImportedProd(name, price, customsFee));
			}
			else
			{
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				Date manufactureDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
				prods.add(new UsedProd(name, price, manufactureDate));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Prod prod : prods)
		{
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
