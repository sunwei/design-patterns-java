package xyz.sunwei.designpattern.rule;

@FunctionalInterface
public interface Rule<T> {
    boolean isSatisfied(T object);
}
