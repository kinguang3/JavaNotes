public class EightQueen {
    int n = 8;
    int[] queenCol;        // queenCol[row] = 该行皇后所在列
    boolean[] cols;        // 列占用
    boolean[] diag1;       // 主对角线 (row - col) 占用
    boolean[] diag2;       // 副对角线 (row + col) 占用
    int count = 0;         // 解的数量

    public void solve() {
        queenCol = new int[n];
        cols  = new boolean[n];
        diag1 = new boolean[2 * n - 1];   // 下标 row-col+n-1，范围 0~2n-2
        diag2 = new boolean[2 * n - 1];   // 下标 row+col，  范围 0~2n-2
        backtrack(0);
    }

    // 处理第 row 行
    private void backtrack(int row) {
        // 终止条件：8 行都放好了，得到一个解
        if (row == n) {
            count++;
            printSolution();
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;   // 主对角线索引
            int d2 = row + col;           // 副对角线索引

            // 剪枝：列 / 主对角线 / 副对角线 任一被占用就跳过
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            // 放置皇后
            queenCol[row] = col;
            cols[col] = diag1[d1] = diag2[d2] = true;

            // 递归下一行
            backtrack(row + 1);

            // 回溯：撤销标记
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    private void printSolution() {
        System.out.println("Solution " + count + ":");
    }

    public static void main(String[] args) {
        new EightQueen().solve();

    }
}