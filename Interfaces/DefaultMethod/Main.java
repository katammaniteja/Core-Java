package Interfaces.DefaultMethod;

public class Main {
    public static void main(String args[]) {
        Bird eagle = new Eagle();
        eagle.canFly();
        System.out.println(eagle.getMinimumFlyHeight());
        Crow crow = new Crow();
        crow.canFly();
        System.out.println(crow.getMinimumFlyHeight());
        System.out.println(crow.canBreathe());
    }
}
