public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = new String[] { "kim", "park", "lee" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] : " + names[i]);
        }
        String tmp = names[2];
        System.out.println("tmp: " + tmp);
        names[0] = "cho";
        System.out.println();
        for (String str : names)
            System.out.println(str);
    } // End Main

}
