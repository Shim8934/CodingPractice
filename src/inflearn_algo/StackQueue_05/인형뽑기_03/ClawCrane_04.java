package inflearn_algo.StackQueue_05.인형뽑기_03;

import java.util.Stack;

public class ClawCrane_04 {

    public static void main(String[] args) throws Exception {
        ClawCrane_04 T = new ClawCrane_04();

        int N = 5;
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int M = 8;
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(T.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int n : moves) {
            n = n-1;
            for (int i = 0; i< board.length; i++) {
                if (board[i][n] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[i][n]);
                        board[i][n] = 0;
                        break;
                    }
                    if (board[i][n] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(board[i][n]);
                    }
                    board[i][n] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
