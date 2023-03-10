package practice;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input maximum sequence Number");
		int n=sc.nextInt();
		int fibprivious=0;int Fibonacci=1;
		int sum=0;
		
		for(int i=1;i<=n;i++) {
		
			System.out.println(fibprivious);
			
			sum=fibprivious+Fibonacci;
			fibprivious=Fibonacci;
			Fibonacci=sum;
			
			
			
			
			
		}
		
	}

}
