package week4;

import java.util.Stack;

public class StackQueueForStack {
	public static void main(String[] args) {
		String[] record={"P 300 6","P 500 3","S 1000 4","P 600 2","S 1200 1"};
		System.out.println(solution(record)[0]);
	}
	public static int[] solution(String[] record) {
		//후입선출법
		Stack<String> ps=new Stack<String>();
		Stack<Integer> pay=new Stack<Integer>();
		Stack<Integer> num=new Stack<Integer>();
		int result=0;
		for(int i=0;i<record.length;i++) {
			if(record[i].split(" ")[0].equals("S")) {
				if(Integer.parseInt(record[i].split(" ")[2])>num.peek()) {
					int pickuppay=pay.peek();
					int pickupnum=num.peek();
					result+=pay.pop()*num.pop();
					result+=pay.peek()*(Integer.parseInt(record[i].split(" ")[2])-pickupnum);
					pay.add(pickuppay);
					num.add(pickupnum);
				}else {
					result+=pay.peek()*Integer.parseInt(record[i].split(" ")[2]);
				}
			}else {
				ps.add(record[i].split(" ")[0]);
				pay.add(Integer.parseInt(record[i].split(" ")[1]));
				num.add(Integer.parseInt(record[i].split(" ")[2]));
			}
			
		}

		return new int[]{result};
	}
}
