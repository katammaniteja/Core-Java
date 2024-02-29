package Interfaces.FunctionalInterface.Lambda;

public class Main {
    public static void main(String args[]) {
        Bird eagleObject = (String value) -> {
            System.out.println(value);
        };
        eagleObject.canFly("Yes Eagle can fly");
    }
}
