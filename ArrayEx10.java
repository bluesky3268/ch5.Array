public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10) + 1);
        }
        System.out.println();
        for (int i = 0; i < numArr.length - 1; i++) { // 0~8까지 9번.
            boolean changed = false;
            for (int j = 0; j < numArr.length - 1 - i; j++) { // 0~(8-1, 2, 3 ... ) 9번, 8번, 7번 .. 반복. 비교를 반복할 수록 비교대상이
                                                              // 줄어들기 때문에 반복횟수를 점점 줄임

                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true; // 자리바꿈이 있으면 changed를 true로 바꿔준다.
                }
            } // End for j
            if (!changed)
                break; // false(if문이 수행되지 않았으면)면 break -> 자리바꿈이 없으면 반복문(i)를 벗어난다.
                       // 그냥 놔둬도 반복문이 종료될 것이지만, 반복이 끝났는데 굳이 반복을 계속할 필요는 없으니깐.

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        } // End for i
    } // End Main

}
