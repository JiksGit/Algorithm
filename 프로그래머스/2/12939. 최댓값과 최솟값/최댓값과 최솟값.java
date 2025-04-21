import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] str = s.split(" ");
        
        int min = Integer.valueOf(str[0]);
        int max = Integer.valueOf(str[0]);
        
        for(int i=1; i< str.length; i++){
            int su = Integer.valueOf(str[i]);
            
            if (min > su ) min = su;
            if (max < su ) max = su;
        }
        
        String answer= min + " " + max;
        return answer;
    }
}