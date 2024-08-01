import java.util.*;
class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : ch){
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char temp = st.pop();
                if((c == ')' && temp == '(') || (c == '}' && temp == '{') || (c == ']' && temp == '[')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}