package com.xworkz.starPatterns;

public class EmptyLeftTriangle {
	public static void main(String[] args) {

		int num = 6;
		for (int i = 0; i <= num; i++) {
			
			for (int j = 0; j <= num; j++) {
				if (j==num || i==num || i+j==num) 

					System.out.print("*");

				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
}
