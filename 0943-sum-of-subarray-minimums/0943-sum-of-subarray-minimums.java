class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        HelperMethod help = new HelperMethod(); 
        
        int[] nextSE = help.nextSmaller(arr);
        int[] prevSE = help.previousSmaller(arr);
        long total = 0;
        int mod = (int)(1e9+7);

        for (int i = 0; i < arr.length; i++) {
            int left = i - prevSE[i];
            int right = nextSE[i] - i;

            total = (total + (long)left * right * arr[i]) % mod;
        }
        return (int) total;
    }
}

class HelperMethod {
    
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            nse[i] = (stk.isEmpty()) ? n : stk.peek();
            stk.push(i);
        }
        return nse;
    }

    // Find the previous smaller element
    public int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            pse[i] = (stk.isEmpty()) ? -1 : stk.peek();
            stk.push(i);
        }
        return pse;
    }
}
