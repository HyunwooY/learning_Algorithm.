package week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQueue {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] record={"P 300 6","P 500 3","S 1000 4","P 600 2","S 1200 1"};
		
		System.out.println(solution(record)[0]);
	}
	public static int[] solution(String[] record) {
		Queue<String> que=new LinkedList<String>();
		int fifs=0;
		for(int i=0;i<record.length;i++) {
			if(decom(record[i],0).equals("S")) {
				//선입선출법
				for(int j=0;j<i;j++) {
					if(decom(record[j],0).equals("P")) {
						if((Integer)decom(record[j],2)>=(Integer)decom(record[i],2)) {
							fifs+=(Integer)decom(record[j],1)*(Integer)decom(record[i],2);
							int fifsleftcount=(Integer)decom(record[j],2)-(Integer)decom(record[i],2);
							record[0]="P "+decom(record[0],1)+" "+fifsleftcount;
							record[i]="S "+decom(record[i],1)+" 0";
							break;
						}else {
							fifs+=(Integer)decom(record[j],1)*(Integer)decom(record[j],2);
							record[i]="S "+decom(record[i],1)+" "+((Integer)decom(record[i],2)-(Integer)decom(record[j],2));
						}
					}
				}
				//후임선출법
				
			}
		}	
		return new int[] {fifs,0};
	}
	public static Object decom(String record,int i) {
		String[] task=record.split(" ");
		if(i==0) {
			return task[0];
		}else if(i==1) {
			return Integer.parseInt(task[1]);
		}else if(i==2) {
			return Integer.parseInt(task[2]);
		}
		return -1;
	}
}
