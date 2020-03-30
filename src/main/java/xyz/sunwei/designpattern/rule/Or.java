package xyz.sunwei.designpattern.rule;

import java.util.ArrayList;
import java.util.List;

public class Or<T> implements OrRule<T> {
    private List<Rule<T>> rules = new ArrayList<>();

    public Or<T> addRule(Rule<T> rule){
        this.rules.add(rule);
        return this;
    }

    @Override
    public boolean isSatisfied(T object) {
        return this.rules.stream().anyMatch(rule -> rule.isSatisfied(object));
    }
}
