public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = { 'a', 'b', 'c', 'd' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // char배열은 그냥 print가능.
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length); // abc를 먼저 넣어놨으니깐 그 다음 인덱스부터 넣어야 하기 때문에 abc.length(4
                                                                  // =index[4]) 에 넣음.
        System.out.println(result);
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

    } // End Main

}
