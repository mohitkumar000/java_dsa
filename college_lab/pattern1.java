package college_lab;

import java.util.Scanner;

//Java program to print reverse pyramid star pattern
//Using for loop
import java.io.*;

class pattern1{
	
public static void main (String[] args)
{
	
	
	int number = 5;
	int i, j;
	
	
	for(i = number; i >= 1; i--)
	{
		
		
		for(j = i; j < number; j++)
		{
			System.out.print(" ");
		}
		
	
		for(j = 1; j <= (2 * i - 1); j++)
		{
			System.out.print("*");
		}
		
		
		System.out.println("");
	}
}
}
