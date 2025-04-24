class Solution {
    public int solution(int n) {
        int result = 1;
        
        if(n == 1 || n == 2) return 1;
        for(int i= n/2+1; i>= 1; i--){
            int sum = 0;
            int point = i;
            while(point > 0){
                sum+= point;
                if(sum > n) break;
                else if(sum == n){
                    result++;
                    break;
                } else {
                    point--;
                }
            }
        }
        
        return result;
    }
}