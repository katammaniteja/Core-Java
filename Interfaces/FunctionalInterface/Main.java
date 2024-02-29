package Interfaces.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String args[]) {
        Consumer<Integer> loggingObject = (Integer val) -> {
            if (val > 10) {
                System.out.println("logging");
            }
        };
        loggingObject.accept(15);

        Supplier<String> isEvenNumer = () -> {
            return "This is the data I'm returning";
        };
        System.out.println(isEvenNumer.get());

        Function<Integer, String> intToString = (Integer num) -> {
            String output = num.toString();
            return output;
        };
        System.out.println(intToString.apply(10));

        Predicate<Integer> isEvenNumber = (Integer num) -> {
            if (num % 2 == 0)
                return true;
            else
                return false;
        };
        System.out.println(isEvenNumber.test(3));
    }
}
