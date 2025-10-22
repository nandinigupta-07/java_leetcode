class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        int i=0;
        int j=0;
        while(i<n || j<n){
             while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;
            if(i==n && j==n) return true;
            if(i==n || j==n) return false;
            if(start.charAt(i)!=target.charAt(j)){
                return false;
            }
            char ch=start.charAt(i);
            if(ch=='L' && i<j) return false;
            if(ch=='R' && i>j) return false;
            i++;
            j++;
        }
        
        return true;
    }
}