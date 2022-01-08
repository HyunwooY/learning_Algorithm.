package week4;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		hanoi(num,1,2,3);

	}
	public static void hanoi(int num,int start, int mid, int to) {
		if(num==1) {
			System.out.println(start +" "+to);
			return;
		}
		hanoi(num-1,start,to,mid);
		System.out.println(start +" "+to);
		hanoi(num-1,mid,start,to);
	}
}
