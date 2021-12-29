package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class PracticeStack1 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> sta=new Stack<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
			String input=br.readLine();
			String[] cmd=input.split(" ");
			switch(cmd[0]) {
			case "push" : sta.add(Integer.parseInt(cmd[1])); break;
			case "pop"	: 
				try {
					System.out.println(sta.pop());
				}catch(EmptyStackException ep) {
					System.out.println(-1);
				}
				break;
			case "size"	: System.out.println(sta.size());break;
			case "empty": 
				if(sta.empty()==true) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "top"	: 
				try {
					System.out.println(sta.peek());
				}catch(EmptyStackException ep) {
					System.out.println(-1);
				};
				break;
			}
		}
	}
}
