import java.util.Stack;
class Solution {
    public int minInsertions(String s) {
        
        Stack<Character> stack = new Stack<>();
        char [] arr = s.toCharArray();
        int ans = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == '('){
                stack.push(arr[i]);
            }
            else{
                if(i+1 < arr.length && arr[i+1] == ')'){
                    i++;
                }else{
                    ans++;
                }
                if(stack.isEmpty()){
                    ans++;
                }
                else{
                    stack.pop();
                }
            }
            
        }
        return ans + (2*stack.size());
    }
}