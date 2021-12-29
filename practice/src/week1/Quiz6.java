package week1;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=Integer.parseInt(scan.nextLine());
		String input=scan.nextLine();
		String[] n=input.split(" ");
		int min=Integer.parseInt(n[0]);
		int max=Integer.parseInt(n[0]);
		for(int i=1;i<num;i++) {
			int b=Integer.parseInt(n[i]);
			min=(min<b)?min:b;
			max=(max>b)?max:b;
		}
		System.out.println(min+" "+max);
	}
}
