package xyz.sunwei.designpattern.rule;

import xyz.sunwei.designpattern.SourceInput;

public class BiggerThan8Rule implements Rule<SourceInput> {
    @Override
    public boolean isSatisfied(SourceInput object) {
        return object.int1 + object.int2 > 8;
    }
}
