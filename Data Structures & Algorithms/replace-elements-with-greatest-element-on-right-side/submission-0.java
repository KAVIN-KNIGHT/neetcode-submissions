class Solution {
    public int[] replaceElements(int[] arr) {
        int m = -1;
        int n= arr.length;
        for(int i=n-1;i>=0;i--)
        {
            int c = arr[i];
            arr[i] = m;
            m= Math.max(c,m);
        }
        return arr;
    }
}