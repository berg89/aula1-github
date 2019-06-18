package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class ProgramFunc
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int numEmp = sc.nextInt();
		
		List<Funcionario> funcs = new ArrayList<>();
		for(int i = 1; i <= numEmp; i++)
		{
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			funcs.add(new Funcionario(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer id = sc.nextInt();
		Funcionario funcionario = funcs.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		if(funcionario != null)
		{
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			funcionario.increaseSalary(percentage);
		}
		else
		{
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Funcionario func : funcs)
		{
			System.out.println(func);
		}
		
		sc.close();
	}

}
