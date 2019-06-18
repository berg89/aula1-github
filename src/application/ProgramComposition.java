package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramComposition
{

	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int numContracts = sc.nextInt();
		sc.nextLine();
		
		Department dept = new Department(department);
		Worker worker = new Worker(name, level, baseSalary, dept);
		for(int i = 1; i <= numContracts; i++)
		{
			HourContract contract = new HourContract();
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			contract.setDate(sdf.parse(sc.nextLine()));
			System.out.print("Value per hour: ");
			contract.setValuePerHour(sc.nextDouble());
			System.out.print("Duration (hours): ");
			contract.setHours(sc.nextInt());
			sc.nextLine();

			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.nextLine();
		String[] split = monthYear.split("/");
		int year = Integer.parseInt(split[1]);
		int month = Integer.parseInt(split[0]);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
