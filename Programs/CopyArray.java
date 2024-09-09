import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        char[] copyFrom = { 'a', 'b', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(copyTo);
        System.out.println(String.valueOf(copyTo));
        System.out.println(Arrays.toString(copyTo));
    }
}
