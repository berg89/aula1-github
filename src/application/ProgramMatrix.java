package application;

import java.util.Scanner;

public class ProgramMatrix
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Exercício resolvido
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++)
		{
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int negativeNumbers = 0;
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				if(mat[i][j] < 0)
				{
					negativeNumbers++;
				}
			}
		}
		System.out.println("Negative numbers = " + negativeNumbers);
		*/
		
		// Exercício proposto
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				if(mat[i][j] == number)
				{
					System.out.println("Position " + i + "," + j + ":");
					
					if((j-1) >= 0)
					{
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if((j+1) < mat[i].length)
					{
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if((i-1) >= 0)
					{
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if((i+1) < mat[i].length)
					{
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
