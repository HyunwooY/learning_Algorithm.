package week2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PracticeQueue1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Queue<Integer> que=new LinkedList<Integer>();
		String sn=scan.nextLine();
		int n=Integer.parseInt(sn);
		for(int i=0;i<n;i++) {
			String cmdset=scan.nextLine();
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
				Iterator<Integer> it=que.iterator();
				int a=0;
				while(it.hasNext()) {
					a=it.next();
				}
				if(a==0) {
					System.out.println(-1);
				}else {
					System.out.println(a);	
				}				
			}
		}
	}
}
/* 알고리즘 정답..
 * 
 * class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		int back = -1;
		for(int i = 0 ; i < N ; i ++) {
			st = new StringTokenizer(br.readLine());
			String type = st.nextToken();
			switch(type) {
			case "push":
				back = Integer.parseInt(st.nextToken());
				queue.offer(back);	
				break;
			case "pop":
				if(queue.isEmpty()) {
					sb.append("-1").append("\n");
					break;
				}
				sb.append(queue.poll()).append("\n");
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				sb.append(queue.isEmpty()? 1: 0).append("\n");
				break;
			case "front":
				sb.append(queue.isEmpty()? -1: queue.peek()).append("\n");
				break;
			case "back":
				sb.append(queue.isEmpty()? -1: back).append("\n");
				break;
				
			}
		}
		System.out.print(sb);
	}
}
*/
