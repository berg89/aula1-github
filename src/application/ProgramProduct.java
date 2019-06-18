package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String productName = sc.nextLine();
		System.out.print("Price: ");
		double productPrice = sc.nextDouble();
		Product product = new Product(productName, productPrice);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
