package Interfaces.NestedInterface;

public class Main {
    public static void main(String args[]) {
        Bird.nonFlyingBird os = new Ostrich();
        Bird e = new Eagle();
        Crane c = new Crane();
        os.canRun();
        e.canFly();
        c.canFly();
        c.canRun();
    }
}
