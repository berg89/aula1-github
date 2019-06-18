package application;

import java.util.Scanner;

import entities.Rent;

public class ProgramPensionato
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int numRooms = sc.nextInt();
		
		Rent[] arrRent = new Rent[10];
		
		for(int i = 1; i <= numRooms; i++)
		{
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			Rent rent = new Rent(name, email);
			arrRent[room] = rent;
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < arrRent.length; i++)
		{
			if(arrRent[i] != null)
			{
				System.out.println(i + ": " + arrRent[i]);
			}
		}
		
		sc.close();
	}

}
