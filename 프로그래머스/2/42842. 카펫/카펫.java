class Solution {
    public int[] solution(int brown, int yellow) {
        int a = 1;
        int b = 1;
        int[] answer = {};
        for(int x =1; x<= brown/2; x++){
            for(int y=1; y<= x; y++){
                if(x*y == brown + yellow){
                    if(2*x + 2*y - 4 == brown){
                        return new int[]{x,y};
                    }
                }
            }
        }
        return new int[]{};
    }
}