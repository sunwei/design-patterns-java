package xyz.sunwei.designpattern.rule;

public interface OrRule<T> extends Rule<T> {
    boolean isSatisfied(T object);
}
