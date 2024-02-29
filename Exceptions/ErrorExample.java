package Exceptions;

public class ErrorExample {
    public static void main(String args[]) {

        method2(); // StackOverFlowError
    }

    public static void method1() {
        String[] arr = new String[900000000 * 900000000]; // java.lang.OutOfMemoryError: Java heap space
        System.out.println(arr);
    }

    public static void method2() {
        method2();
    }
}