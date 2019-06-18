package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exe3
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.setName(sc.nextLine());
		student.setFirstGrade(sc.nextDouble());
		student.setSecondGrade(sc.nextDouble());
		student.setThirdGrade(sc.nextDouble());
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.getFinalGrade()));
		System.out.printf(student.getFinalMsg());
	}

}
