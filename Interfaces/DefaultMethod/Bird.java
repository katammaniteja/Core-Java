package Interfaces.DefaultMethod;

public interface Bird {
    public void canFly();

    default int getMinimumFlyHeight() {
        return 100;
    }

    default boolean canBreathe() {
        return true;
    }
}
