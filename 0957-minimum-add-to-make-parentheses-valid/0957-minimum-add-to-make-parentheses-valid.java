import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char [] arr = s.toCharArray();
        for(char ch : arr){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                char temp = stack.peek();
                if(temp == '(' && ch == ')'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}