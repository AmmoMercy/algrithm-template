public class MatrixDFS {

    // @solution-sync:begin
    int[][] matrix;
    boolean paint[][];
    int[][] directions;
    boolean visited[][];

    public void init(int m, int n) {
        paint = new boolean[matrix.length][matrix[0].length];

        int[][] directions4 = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] directions8 = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1},{-1, -1}, {1, -1}, {-1, 1}, {1, 1}};
        directions=directions4;
        visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j);
            }
        }

    }

    void dfs(int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) return;
        if (visited[i][j]) return;
        visited[i][j] = true;
        //visit the matrix here
        //......
        for (int k = 0; k < directions.length; k++) {
            int[] dir = directions[k];
            dfs(i + dir[0], j + dir[1]);
        }
    }


}




