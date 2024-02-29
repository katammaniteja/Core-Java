package Interfaces.DefaultMethod;

public class Crow implements Bird, LivingThing {
    public void canFly() {
        System.out.println("Yes Crow can fly");
    }

    public boolean canBreathe() {
        return true;
    }
}
