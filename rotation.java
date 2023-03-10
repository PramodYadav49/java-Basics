package practice;

import java.util.Scanner;

public class rotation {

	private static final String big = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		big int number=sc.nextInt();
		int rotation=sc.nextInt();
		int copy=number;
		int count=0;
		while(copy!=0) {
			copy=copy/10;
			count++;
		}
		int pow=(int) Math.pow(10, count-1);
		while(rotation!=0) {
			int x=number%10;
			x=x*pow;
			number=number/10;
			number=number+x;
			rotation--;
			
			
			
		}
		System.out.println(number);
		
	}

}
