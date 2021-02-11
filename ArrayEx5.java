public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] score = { 100, 95, 90, 100, 90 };

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / score.length;
        System.out.println("점수의 총합은 " + sum + "점이고, ");
        System.out.println("점수의 평균은 " + avg + "점이다.");

    }

}
