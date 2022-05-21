package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Algorithm_20220521 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//Test Case
		map.put("one4seveneight",	1478);
		map.put("23four5six7",	234567);
		map.put("2three45sixseven",	234567);
		map.put("123",	123);
		//����
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tc = it.next();
			if(map.get(tc) == solution(tc)) {
				System.out.println(tc+"�� ���� �����Դϴ�");
			}else {
				System.out.println(tc+"�� ���� Ʋ�Ƚ��ϴ�");
				
			}
		}
	}
	
	public static int solution(String s) {
        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int answer = 0;
        String temp = s;
        HashMap<String,Integer> chart = new HashMap<>();
        for(int i=0;i<10;i++){
            chart.put(eng[i],i);
        }
        for(String engnum:eng){
            if(s.contains(engnum)){
                temp = temp.replaceAll(engnum,chart.get(engnum).toString());
            }
        }
        answer = Integer.parseInt(temp);
        return answer;
	}
}
