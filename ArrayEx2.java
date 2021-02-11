import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        // int[] iArr3 = new int[] { 100, 90, 80, 70, 60 };
        int[] iArr3 = { 100, 90, 80, 70, 60 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < iArr1.length; i++) {
            System.out.println(iArr1[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // 배열의 참조변수를 출력할 경우 타입@주소 값을 반환함.
        System.out.println(chArr); // char배열만 그냥 출력 가능함.

    }

}
