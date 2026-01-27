class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int uu=0;
        if(num<0){
            num=num*-1;
            uu=-1;

        }
        StringBuilder sb=new StringBuilder();
        while(num>0){
            int rem=num%7;
            sb.append(rem);
            num=num/7;
        }
        if(uu==-1){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}