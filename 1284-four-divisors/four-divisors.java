class Solution {
    public int check(int val){
             int sum=0;
             int cnt=0;
            int org=val;
            val=(int)Math.sqrt(val);
            for(int i=1;i<=val;i++){
                if(org%i==0){
                    int u=org/i;
                     sum+=i;
                     if(i!=u){
                        sum+=u;
                      cnt+=2;
                     }else{
                        sum+=u;
                        cnt+=1;
                     }
                      
                }
            }
            if(cnt==4){
                return sum;
            }else{
                return 0;
            }
        }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=check(nums[i]);   
        }
        return sum;
    }
}