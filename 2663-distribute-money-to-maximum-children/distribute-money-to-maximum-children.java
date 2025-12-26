class Solution {
    public int distMoney(int money, int children) {
         if(money<children) return -1;
        if(money==children || money<8 || money==8) return 0;
        int child=children-1;
        int mul=8*child ;
        int bachakucha=Math.abs(money-mul);
        int u =0;
        while(mul>money || u> bachakucha  ){
             child--;
            mul=8*child ;
            bachakucha=Math.abs(money-mul);
              u=children-child;
        }
        if(children-child==1 && bachakucha==4 || (children-child==1 && bachakucha==0)) return child-1;
        if(bachakucha==4 &&  child>=2){
            return child;
        }
        if(bachakucha==4 &&  child!=1){
            return child-1;
        }
         
        if(bachakucha==8 && children-child==1){
            return children;
        }
        if(mul>1 && mul!=4){
            return child ;
        }

        return 0;
    }
}