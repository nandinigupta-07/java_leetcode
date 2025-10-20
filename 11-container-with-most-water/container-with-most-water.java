class Solution {
    public int maxArea(int[] height) {
        int l=0;
        
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int hei=Math.min(height[l],height[r]);
            int width=r-l;
            ans=Math.max(ans,hei*width);
            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}