
public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int tmp = 0;
        int j = 0;
        for (int i = 0; i < ball.length; i++) {
            j = (int) (Math.random() * 45); // 배열의 인덱스를 나타낼 것이기 때문에 ball.length의 인덱스만큼만
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;

        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[" + i + "] : " + ball[i]);
            System.out.println();
        }
    } // End Main

}
