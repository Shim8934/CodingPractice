package programmares.kthnumber_6;

import java.util.Arrays;

public class KthNumber_6 {

    public static void main(String[] args) throws Exception {
        KthNumber_6 T = new KthNumber_6();

        System.out.println("KthNumber_6 Start");

        int[] arrays = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] answer = T.solution(arrays,commands);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; ++i){
            int [] copyOfRange = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);

            Arrays.sort(copyOfRange);
            System.out.println("copyOfRange = " + Arrays.toString(copyOfRange));
            answer[i] = copyOfRange[commands[i][2] - 1];
        }

        return answer;
    }
}
