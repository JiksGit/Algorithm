class Solution {
    public int[] solution(String s) {
        int zero_count = 0;
        int count=0;
        
        while(!s.equals("1")){
            int num = 0;
            StringBuilder sb= new StringBuilder();
            String[] str = s.split("");
            for(int i=0; i<str.length; i++){
                if(str[i].equals("0")){
                    zero_count++;
                } else {
                    num ++;
                }
            }
            s = Integer.toBinaryString(num);
            count++;
        }
        int[] answer = {count, zero_count};
        return answer;
    }
}