public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        } // End for

        System.out.print("배열 중 최대값은 " + max + "이고, ");
        System.out.println("최소값은 " + min + "이다.");

    } // End Main

}
