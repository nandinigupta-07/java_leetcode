class Solution {
    public int minElement(int[] arr) {
        int min=10000;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            while(arr[i]>0){
                int temp=arr[i]%10;
                sum=sum+temp;
                arr[i]=arr[i]/10;
            }
        min=Math.min(min,sum);
        }
        return min;
    }
}