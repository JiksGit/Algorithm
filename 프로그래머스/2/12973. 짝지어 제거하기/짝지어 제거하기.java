import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        stack.add(s.charAt(0));
        int index = 1;
        
        while(index < s.length()){
            if(stack.isEmpty() || stack.peek() != s.charAt(index)){
                 stack.add(s.charAt(index));  
            } else {
                stack.pop();
            }
            index++;
        }
        if(stack.isEmpty()) return 1;
        else return 0;
    }
}