//Matt Lynn
//Phil McGrath


package co.grandcircus;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args)
	{
		
		String input = "y";
		int num, square, cube;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		System.out.println("You can even learn your times tables if we have time!");
		do{
					 
		System.out.println("Please, enter an integer: ");
		num = scan.nextInt();
		square = squareNum(num);
		cube = cubeNum(num);
		//String Sean = "";
		System.out.println(num + " " + square + " " + cube);
		System.out.println("\nNumber      Squared     Cubed");
		//Sean = "\nNumber" + String.format("%12d", "Squared") + String.format("%12d", "Cubed");
		
		System.out.println("=======     =======     ======");
		

		
//		System.out.print(num);
//		System.out.printf("%8d", square);
//		System.out.printf("%8d", cube);
		printTable(num);
		scan.nextLine();	//garbage line
		System.out.println("Would you like to input another number? Enter y/n: ");
		input = scan.nextLine();
		
		}while (input.equals("y"));
		System.out.println("Goodbye, fool");
		
		scan.close();
	}
	
	public static int squareNum(int num)
	{
		return num*num;
	}
	
	public static int cubeNum(int nom)
	{
		return nom * nom * nom;
	}
	
	public static void printTable (int num)
	{
		for(int i = 1; i <= num; i++)
		{
			System.out.print(i);
			System.out.printf("%12d", squareNum(i));
			System.out.printf("%12d", cubeNum(i));
			System.out.println();
		}
			
	}
	
}
