package xyz.sunwei.designpattern.rule;

import java.util.ArrayList;
import java.util.List;

public class And<T> implements AndRule<T> {
    final private List<Rule<T>> rules = new ArrayList<>();

    public And<T> addRule(Rule<T> rule){
        this.rules.add(rule);
        return this;
    }

    @Override
    public boolean isSatisfied(T object) {
        return this.rules.stream().allMatch(rule -> rule.isSatisfied(object));
    }
}
