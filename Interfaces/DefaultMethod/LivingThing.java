package Interfaces.DefaultMethod;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
