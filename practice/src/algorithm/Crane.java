package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Crane {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));
	}
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();
        int c = 0;
        for(int i=0;i<moves.length;i++){
            c = moves[i]-1;
            for(int j=0;j<board.length;j++){
                if(board[j][c]!=0){
                    basket.add(board[j][c]);
                    board[j][c] = 0;
                    break;
                }
            }
        }
        while(true) {
        	boolean check=false;
	        for(int i=0;i<basket.size()-1;i++) {
	        	if(basket.get(i)==basket.get(i+1)) {
	        		basket.remove(i);basket.remove(i);
	        		answer+=2;
	        		check = true;
	        	}
	        }
	        if(!check) 	break;
        }
        
        return answer;
    }
}
