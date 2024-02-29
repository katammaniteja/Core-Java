package Interfaces.NestedInterface;

public interface Bird {

    public void canFly();

    public interface nonFlyingBird {
        public void canRun();
    }
}