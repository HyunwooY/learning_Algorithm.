package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que=new LinkedList<Integer>();
		String sk=br.readLine();
		String[] kk=sk.split(" ");
		int n=Integer.parseInt(kk[0]);
		int k=Integer.parseInt(kk[1]);
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		String result="<";
		while(que.size()!=1) {
			int a=0;
			for(int i=1;i<k;i++) {
				a=que.poll();
				que.add(a);
			}
			result+=que.poll()+", ";
		}
		result+=que.poll()+">";
		System.out.println(result);
	}
}
