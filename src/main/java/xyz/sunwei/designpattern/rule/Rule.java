package xyz.sunwei.designpattern.rule;

public interface Rule<T> {
    boolean isSatisfied(T object);
}
