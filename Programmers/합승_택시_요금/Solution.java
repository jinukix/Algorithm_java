package 합승_택시_요금;

class Solution {

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] node = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                node[i][j] = 200 * 100000 + 1;
            }
            node[i][i] = 0;
        }

        for (int[] fare : fares) {
            node[fare[0]][fare[1]] = fare[2];
            node[fare[1]][fare[0]] = fare[2];
        }

        for (int k = 1; k < n + 1; k++) {
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (node[i][j] > node[i][k] + node[k][j]) {
                        node[i][j] = node[i][k] + node[k][j];
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n + 1; i++) {
            min = Math.min(min, node[s][i] + node[i][a] + node[i][b]);
        }

        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
            6, 4, 6, 2, new int[][]{
                {4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66},
                {2, 3, 22}, {1, 6, 25}
            }
        ));
    }
}