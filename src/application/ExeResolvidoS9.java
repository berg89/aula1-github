package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emp;
import entities.OutsourcedEmployee;

public class ExeResolvidoS9 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numEmp = sc.nextInt();
		
		List<Emp> emps = new ArrayList<>();
		for(int i = 1; i <= numEmp; i++)
		{
			sc.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			Emp emp;
			if(outsourced == 'y')
			{
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			else
			{
				emp = new Emp(name, hours, valuePerHour);
			}
			
			emps.add(emp);
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Emp emp : emps)
		{
			System.out.println(emp);
		}
		
		sc.close();
	}

}
