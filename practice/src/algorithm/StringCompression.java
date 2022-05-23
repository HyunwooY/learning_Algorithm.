package algorithm;

public class StringCompression {
	public static void main(String[] args) {
		System.out.println("°á°ú : "+solution("aabbaccc"));
	}
	public static int solution(String s) {
        String result = "";
        int answer = 1000;
        String tempS = "";
        int count = 1;
        String[][] key = new String[3][4];
        for(int i=1;i<=s.length();i++){
        	for(int j=0;j+i<=s.length();j+=i){
                if(j+i<=s.length()-1){
                    if(tempS.equals(s.substring(j,i+j))){
                    	System.out.println(tempS+"##"+s.substring(j,i+j));
                        count++;
                    }else{
                    	System.out.println(tempS+"##"+s.substring(j,i+j));
                        tempS = s.substring(j,i+j);
                        if(count==1){
                            result+=tempS;
                        }else{
                            result+=count+tempS;
                        }
                        count=1;
                    }
                }else{
                    tempS = s.substring(j,i+j);
                }
                //System.out.println(tempS+",,,,,"+result);
            }
            if(answer>result.length()) answer = result.length();
            result = "";
        }
        return answer;
    }
}
