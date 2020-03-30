package xyz.sunwei.designpattern.rule;

public interface OrRule<T> extends Rule<T> {
    @Override
    boolean isSatisfied(T object);
}
