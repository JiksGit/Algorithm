class Solution {
    public int[] solution(int brown, int yellow) {
        
        for(int i =3 ; i<= brown/2; i++){
            for(int j = 3; j<= yellow+2; j++){
                if(i< j) continue;
                if(brown == 2*i+2*(j-2) && yellow == (i-2)*(j-2)){
                    return new int[]{i,j};
                }
            }
        }
        
        return new int[]{0,0};
    }
}