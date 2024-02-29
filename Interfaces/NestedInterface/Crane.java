package Interfaces.NestedInterface;

public class Crane implements Bird, Bird.nonFlyingBird {
    public void canFly() {
        System.out.println("Crane can fly");
    }

    public void canRun() {
        System.out.println("Crance can fly and run");
    }
}
