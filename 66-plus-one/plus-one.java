class Solution {
    public int[] plusOne(int[] digit) {
        int n=digit.length-1;
        if(digit[n]<9){
            digit[n]=digit[n]+1;
            return digit;
        }
          if(digit.length==1 && digit[0]==9){
            int arr[]=new int[2];
            arr[0]=1;
            arr[1]=0;
            return arr;
          } 
          int count=0;
          for(int i=digit.length-1;i>=0;i--){
            if(digit[i]==9){
                count++;
            }
          }
          if(count==digit.length){
            int nums[]=new int[digit.length+1];
            nums[0]=1;
            for(int i=1;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
          }
          for(int i=digit.length-1;i>0;i--){
             if(digit[i]==9){
                count++;
                int u=10%9;
                digit[i]=0;
                if(digit[i-1]!=9){
                    digit[i-1]=digit[i-1]+u;
                    return digit;
                }     
             }
              
          }
         return digit;
    }
}