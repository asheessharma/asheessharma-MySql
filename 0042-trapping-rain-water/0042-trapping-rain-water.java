class Solution {
    public int trap(int[] arr) {
        int len = arr.length;
        int [] left = new int [len];
        int [] right = new int [len];
        left[0] = arr[0];
        for(int i = 1; i < len ;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        } 
        right[len - 1] = arr[len - 1];
        for(int i = len - 2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int total = 0;
        for(int i = 0; i < len ; i++){
            //lax = left max;
            int lax = left[i];
            int rax = right[i];
            if(arr[i] < lax && arr[i] < rax){
                total += Math.min(lax,rax) - arr[i];
            }
        }
        return total;
    }
}