package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String[] n=br.readLine().split(" ");
			int up=Integer.parseInt(n[0]);
			int down=Integer.parseInt(n[1]);
			int height=Integer.parseInt(n[2]);
			int days=(height-down)/(up-down);
			if((height-down)%(up-down)!=0) {
				days++;
			}
			System.out.println(days);
		}catch(IOException ie	) {
			ie.printStackTrace();
		}
	}
}














