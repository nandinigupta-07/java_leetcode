class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(list.get(i-1))){
                arr[0]=list.get(i);
                
            }
        }
        int n=grid.length;
        for(int i=1;i<=n*n;i++){
            if(!list.contains(i)){
                arr[1]=i;
                break;
            }
        }
 
        return arr;
    }
}