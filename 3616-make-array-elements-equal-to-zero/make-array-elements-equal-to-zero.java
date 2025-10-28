class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int valid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                 
                if(check(nums,i,-1)) valid++;
                if(check(nums,i , +1)) valid++;
            }
             
        }
        return valid;
    }
    public boolean check(int nums[],int curr,int dir){
        int n=nums.length;
        int arr[]=nums.clone();
        while(curr>=0 && curr<n){
            if(arr[curr]==0){
                curr+=dir;
            }else{
                arr[curr]--;
                dir*=-1;
                curr+=dir;
            }
             
        }
        for(int x: arr){
                if(x!=0) return false;
            }
             return true;
        
         
            
    }
}