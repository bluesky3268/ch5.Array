public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
            }
        }
        // 향상된 for문은 저장된 값을 순차적으로 읽어올 수는 있지만, 변경할 수는 없다.
        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    } // End main
}
