class Solution {
    public int bestClosingTime(String customer) {
        int y=0;
        int n=0;
        for(int i=0;i<customer.length();i++){
            if(customer.charAt(i)=='N'){
                n++;
            }else{
                y++;
            }
        }
        if(y==customer.length() ){
            return y;
        }
        if(n==customer.length()){
            return 0;
        }
        int min=0;
        int yy=0;
        int ans=0;
        for(int i=0;i<customer.length();i++){
              
             if(customer.charAt(i)=='Y'){
                ans+=-1;
             }else{
                ans+=1;
             }
             if(ans<min){
                    yy=i+1;
                    min=ans;
             }
        }
        return yy;
    }
}