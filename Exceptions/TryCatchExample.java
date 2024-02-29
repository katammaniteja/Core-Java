package Exceptions;

// import java.io.FileNotFoundException;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            method("dummy");
        } catch (ClassNotFoundException obj) {
            // Handle it
        } catch (InterruptedException obj) {
            // Handle it
        }
        // catch (FileNotFoundException obj) {} --> Catch block can only catch the
        // exception which can be thrown by the try block

        // try{method("null");}catch(Exception obj){}catch(ClassNotFoundException obj){}
        // ---> this one is not allowed since parent handled the child exception

        try {
            method("null");
        } catch (ClassNotFoundException obj) {
        } catch (Exception e) {
        } // This one is allowed

        try {
            method("null");
        } catch (ClassNotFoundException | InterruptedException obj) {
        } // We can catch multiple exceptions in one catch block also
    }

    public static void method(String name) throws ClassNotFoundException, InterruptedException {
        if (name.equals("dummy")) {
            throw new ClassNotFoundException();
        } else if (name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
