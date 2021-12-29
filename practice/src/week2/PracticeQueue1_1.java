package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que=new LinkedList<Integer>();
		String sn=br.readLine();
		int n=Integer.parseInt(sn);
		for(int i=0;i<n;i++) {
			String cmdset=br.readLine();
			String[] cmd=cmdset.split(" ");
			if(cmd[0].equals("push")) {
				que.add(Integer.parseInt(cmd[1]));
			}else if(cmd[0].equals("pop")) {
				try {
					int a=que.poll();
					System.out.println(a);
				}catch(NullPointerException ne) {
					System.out.println(-1);
					continue;
				}
			}else if(cmd[0].equals("size")) {
				System.out.println(que.size());
			}else if(cmd[0].equals("empty")) {
				if(que.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(cmd[0].equals("front")) {
				try {
					int a=que.peek();
					System.out.println(a);
				}catch(NullPointerException ne) {
					System.out.println(-1);
					continue;
				}
			}else if(cmd[0].equals("back")) {
				Queue<Integer> que1=new LinkedList<Integer>();
				while(que.size()!=1) {
					que1.add(que.poll());
				}
				int temp=que.poll();
				System.out.println(temp);
				while(que.size()==0) {
					que.add(que1.poll());
				}
				que.add(temp);				
			}
		}
	}
}
