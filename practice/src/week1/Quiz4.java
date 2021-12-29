package week1;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int times=scan.nextInt();
		for(int i=0;i<times;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+ (a+b));
		}
	}
}
