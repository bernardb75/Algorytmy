package Zajecia1003.WyrazeniaLambda;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T object);
}
