package com.xworkz.primeNumber;

public class PrimeNumberUsingLoop {
public static void main(String[] args) {
	int i=2;
	int num=12;
	int count=0;
	while(i<num) {
		if(num%i==0) 
			count++;
			break;}
	if(count==0) {
		System.out.println("number is prime");
	}
	else {
		System.out.println("number is not prime");
	}
}
}

