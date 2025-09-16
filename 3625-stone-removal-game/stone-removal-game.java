class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int remove=10;
        boolean bool=true;
        while(n>=remove){
            n-=remove;
            remove--;
            bool=!bool;
        }
        return !bool;
    }
}