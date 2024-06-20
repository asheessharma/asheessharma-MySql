class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                list.add(ch);
            }
        }
        String temp="";
        int len = list.size()-1;
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                temp+=list.get(len--);
            }
            else{
                temp+=ch;
            }
        }
        return temp;
    }
}