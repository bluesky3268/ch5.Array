import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("변경 전 ");
        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println("변경 후 ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + ", ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(arr));

    } // End Main

}
