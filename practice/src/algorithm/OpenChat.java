package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChat {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		solution(record);
	}
	
	public static String[] solution(String[] record) {
	    String[] answer = {};
	    String[]  userInfo;
	    HashMap<String, String> user = new HashMap<>();
	    
	    for(int i=0;i<record.length;i++) {
	    	userInfo = record[i].split(" ");
	    	if("Enter".equals(userInfo[0]) || "Change".equals(userInfo[0])){
	    		user.put(userInfo[1], userInfo[2]);
	    	}
	    }
	    List<String> list = new ArrayList<>();
	    for(int i=0;i<record.length;i++) {
	    	userInfo = record[i].split(" ");
	    	if("Enter".equals(userInfo[0])) {
	    		list.add(user.get(userInfo[1])+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
	    	}
	    	if("Leave".equals(userInfo[0])) {
	    		list.add(user.get(userInfo[1])+"´ÔÀÌ ³ª°¬½À´Ï´Ù.");
	    	}
	    }
	    answer = list.toArray(new String[list.size()]);
	    
	    return answer;
	}
}


