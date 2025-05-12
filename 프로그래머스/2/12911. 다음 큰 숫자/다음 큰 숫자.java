class Solution {
    public int solution(int n) {
        // 2진수의 문자열로 전환
        String s = Integer.toBinaryString(n);
        // 1의 개수 카운트
        int count = 0;
        for(int i =0; i< s.length(); i++){
            if(s.substring(i,i+1).equals("1")) count++;
        }
        // n의 값을 증가시키며, 그 문자열의 1의 count의 개수가 같으면 return
        while(true){
            n++;
            s = Integer.toBinaryString(n);
            
            int now_count = 0;
            for(int i =0; i< s.length(); i++){
                    if(s.substring(i,i+1).equals("1")) now_count++;
            }
            
            if(count == now_count){
                return n;
            }
        }
    }
}