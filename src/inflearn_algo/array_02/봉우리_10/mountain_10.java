package inflearn_algo.array_02.봉우리_10;

class mountain_10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        mountain_10 T = new mountain_10();

        System.out.println("mountain_10 Start");

        int n = 5;
        int[][] nums = {
                {5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}

        };

        System.out.println(T.solution(n, nums));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                boolean flag = true;
                for (int k = 0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >=0 && nx < n && ny >=0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }

}