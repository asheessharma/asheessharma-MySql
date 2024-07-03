import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
       Collection<Integer> values = map.values();
       Set<Integer> set = new HashSet<>(values);

       if(values.size()==set.size()){
        return true;
       }
       return false;
    }
}