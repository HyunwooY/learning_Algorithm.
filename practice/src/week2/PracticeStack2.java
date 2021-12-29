package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PracticeStack2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String a=br.readLine();
			System.out.println(check(a));
		}
	}
	public static String check(String a) {
		int f=0;
		int b=a.length();
		int rnum=0;
		int lnum=0;
		if(b%2!=0) {
			return "NO";
		}else {
			if(String.valueOf(a.charAt(f)).equals("(") && String.valueOf(a.charAt(b-1)).equals(")")){
				for(int j=0;j<a.length();j++) {
					if(String.valueOf(a.charAt(j)).equals("(")) {
						rnum++;
					}else {
						lnum++;
					}
				}
				if(rnum==lnum) {
					return "YES";
				}else {
					return "NO";
				}
			}else {
				return "NO";
			}
		}
	}
}
/*
 	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String a=br.readLine();
			System.out.println(check(a));
		}
				
	}
	public static boolean check(String a) {
		int f=0;
		int b=a.length()-1;
		int lnum=a.length()-a.replaceAll("\\(", "").length();
		int rnum=a.length()-a.replaceAll("\\)", "").length();
		if(b+1%2!=0) {
			return false;
		}else {
			if((a.charAt(f)=='(' && a.charAt(b)==')')){
				if(lnum==rnum) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
*/
