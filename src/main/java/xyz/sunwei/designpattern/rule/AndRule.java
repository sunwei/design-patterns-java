package xyz.sunwei.designpattern.rule;

public interface AndRule<T> extends Rule<T> {
    @Override
    boolean isSatisfied(T object);
}
