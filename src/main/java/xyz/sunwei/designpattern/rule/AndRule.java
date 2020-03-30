package xyz.sunwei.designpattern.rule;

public interface AndRule<T> extends Rule<T> {
    boolean isSatisfied(T object);
}
