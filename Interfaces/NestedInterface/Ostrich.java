package Interfaces.NestedInterface;

public class Ostrich implements Bird.nonFlyingBird {
    public void canRun() {
        System.out.println("Ostrich can run but cannot fly");
    }
}