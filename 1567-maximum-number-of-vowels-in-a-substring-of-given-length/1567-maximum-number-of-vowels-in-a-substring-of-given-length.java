class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int len = 0;
        int maxlen = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        
        for(int i = 0;i<k;i++){
            if(set.contains(s.charAt(i))){
                len++;
            }
        }
        maxlen = len;
        for(int j = k ;j<n;j++){
            if(set.contains(s.charAt(j))){
                len++;
            }
            if(set.contains(s.charAt(j-k))){
                len--;
            }
            maxlen = Math.max(len,maxlen);
        }
       
        return maxlen;
    }
}