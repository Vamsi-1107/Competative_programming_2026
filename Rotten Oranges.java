import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();

                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int time = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] current = q.poll();

                int r = current[0];
                int c = current[1];

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < m
                            && grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;

                        q.add(new int[]{nr, nc});
                    }
                }
            }

            time++;
        }

        if (fresh == 0)
            System.out.println(time);
        else
            System.out.println(-1);

        sc.close();
    }
}
