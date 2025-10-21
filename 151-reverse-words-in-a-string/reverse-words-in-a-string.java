class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        String neww[]=new String[arr.length];
        int u=0;
        for(int i=arr.length-1;i>=0;i--){
            neww[u]=arr[i];
            u++;
        }
        return String.join(" ",neww);
    }
}

