import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++; // numArr[3]의 값이 5라면, counter[5]의 값을 +1한다.
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(counter));
    }// End Main

}
