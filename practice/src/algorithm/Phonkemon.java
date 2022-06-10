package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Phonkemon {
	public static void main(String[] args) {
		
	}
	public int solution(int[] nums) {
		int answer = 0;
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.stream().distinct().collect(Collectors.toList());
        answer = list.size();
        if(answer>nums.length/2) {
        	return nums.length/2;
        }else {
        	return answer;
        }
    }
}
