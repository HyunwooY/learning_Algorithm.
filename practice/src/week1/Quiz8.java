package week1;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result=fivonacci(n);
		System.out.println(result);
	}
	public static int fivonacci(int n) {
		int a, b;
		a=0;
		b=1;
		if(n==0) {
			return a;
		}else if(n==1) {
			return b;
		}else{
			return fivonacci(n-1)+fivonacci(n-2);
		}
	}
}
