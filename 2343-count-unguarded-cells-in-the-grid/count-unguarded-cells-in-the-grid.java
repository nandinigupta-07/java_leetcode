class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int cnt = 0;

        // Mark guards
        for (int[] g : guards) {
            grid[g[0]][g[1]] = 1;
        }

        // Mark walls
        for (int[] w : walls) {
            grid[w[0]][w[1]] = 2;
        }

        // Directions → down, up, left, right
        int[][] dirs = {{1,0}, {-1,0}, {0,-1}, {0,1}};

        // Simulate guards' visibility
        for (int[] g : guards) {
            int r = g[0], c = g[1];
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                while (nr >= 0 && nr < m && nc >= 0 && nc < n 
                        && grid[nr][nc] != 1 && grid[nr][nc] != 2) {

                    if (grid[nr][nc] == 0)
                        grid[nr][nc] = 3;  // mark as guarded

                    // move further in this direction
                    nr += d[0];
                    nc += d[1];
                }
            }
        }

        // Count unguarded cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    cnt++;
            }
        }

        return cnt;
    }
}
