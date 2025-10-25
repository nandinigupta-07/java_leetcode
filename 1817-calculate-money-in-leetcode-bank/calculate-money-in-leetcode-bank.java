class Solution {
    public int totalMoney(int n) {
        int sum=0;
         int i=1;
         int o=0;
         int p=7;
        while(n>0 ){
            while(n>0 && i<=p){
                 sum=sum+i;
                 i++;
                 n--;
            }
            o++;
            
            i=1+o;
            
            p=7+o;

             
        }
        return sum;
    }
}

