package leetcode.backtrack;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/1 22:26
 */

/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 */
public class _79exist {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] vis = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, word, vis, i, j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, String word, boolean[][] vis, int i, int j, int idx) {
        if (word.charAt(idx) != board[i][j]) {
            return false;
        } else if (idx == word.length() - 1) {
            return true;
        }

        vis[i][j] = true;
        boolean result = false;
        for (int[] direction : directions) {
            i += direction[0];
            j += direction[1];
            if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
                if (!vis[i][j]){
                    boolean flag = check(board, word, vis, i, j, idx + 1);
                    if (flag){
                        result = true;
                        break;
                    }
                }
            }
            i -= direction[0];
            j -= direction[1];
        }
        vis[i][j] = false;
        return result;
    }
}
