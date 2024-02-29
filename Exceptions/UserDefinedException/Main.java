package Exceptions.UserDefinedException;

public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyCustomException e) {
            // handle exception
        }
    }

    public static void method() throws MyCustomException {
        throw new MyCustomException("Some issue arised");
    }
}
