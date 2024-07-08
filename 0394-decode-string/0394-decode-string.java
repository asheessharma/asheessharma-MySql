class Solution {
    public String decodeString(String s) {
        
         Stack<Integer> kStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                kStack.push(k);
                strStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeatTimes = kStack.pop();
                StringBuilder temp = currentString;
                currentString = strStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentString.append(temp);
                }
            } else {
                currentString.append(ch);
            }
        }
        
        return currentString.toString();
    }
}