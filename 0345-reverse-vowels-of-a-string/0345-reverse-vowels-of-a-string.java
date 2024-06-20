class Solution {
    public String reverseVowels(String s) {
        // ArrayList<arr[i]aracter> list = new ArrayList<>();
        // for(int i = 0 ; i < s.length() ; i++){
        //     arr[i]ar arr[i] = s.arr[i]arAt(i);
        //     if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u'|| arr[i] == 'A'|| arr[i] == 'E'|| arr[i] == 'I'|| arr[i] == 'O'|| arr[i] == 'U'){
        //         list.add(arr[i]);
        //     }
        // }
        // String temp="";
        // int len = list.size()-1;
        // for(int j = 0 ; j < s.length() ; j++){
        //     arr[i]ar arr[i] = s.arr[i]arAt(j);
        //     if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u'|| arr[i] == 'A'|| arr[i] == 'E'|| arr[i] == 'I'|| arr[i] == 'O'|| arr[i] == 'U'){
        //         temp+=list.get(len--);
        //     }
        //     else{
        //         temp+=arr[i];
        //     }
        // }
        // return temp;

        Set<Character> set = new HashSet<>();
        char [] arr = s.toCharArray();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int i = 0 ;
        int j = s.length() - 1;
        while(i< j){
            while(i<j && !set.contains(arr[i])){
                i++;
            }
            while( i<j && !set.contains(arr[j])){
                j--;
            }
            if(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        return new String(arr);
    }
}