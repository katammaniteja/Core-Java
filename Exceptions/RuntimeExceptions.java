package Exceptions;

public class RuntimeExceptions {
    public static void main(String[] args) {
        int val = 5 / 0; // ArtithmeticException
        System.out.println(val);

        int[] arr = new int[4];
        arr[10] = 10; // IndexOutofBoundException

        Object val1 = 0;
        System.out.println((String) val1); // ClassCastException

        String val3 = null;
        System.out.println(val3.charAt(0)); // NullPointerException

        int val4 = Integer.parseInt("aaa"); // IllegalArgumentException
    }
}
