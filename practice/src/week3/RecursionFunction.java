package week3;

import java.io.IOException;
import java.util.Scanner;

public class RecursionFunction {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion(num,0);
		
	}
	public static void recursion(int num,int count) {
		String underbar="";
		for(int i=0;i<count;i++) {
			underbar+="____";
		}
		System.out.println(underbar+ "\"����Լ��� ������?\"");
		System.out.println(underbar+ "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n"+ 
						   underbar+ "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n"+
						   underbar+ "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		if(count+1==num) {
			String last="____";
			System.out.println(last+underbar+ "\"����Լ��� ������?\""); 
			System.out.println(last+underbar+ "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(last+underbar+ "��� �亯�Ͽ���."); 
		}else {
			count++;
			recursion(num,count);
		}
		System.out.println(underbar+ "��� �亯�Ͽ���.");
	}
}














