class Solution {
    public int smallestNumber(int n) {
        String binary=Integer.toBinaryString(n);
        char arr[]=binary.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                 arr[i]='1';
            }
        }
        String up=new String(arr);
        int dec=Integer.parseInt(up,2);
        return dec;
    }
}