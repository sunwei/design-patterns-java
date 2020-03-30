package xyz.sunwei.designpattern.rule;

import org.junit.jupiter.api.Test;
import xyz.sunwei.designpattern.SourceInput;

import static org.junit.jupiter.api.Assertions.*;

class RuleTests {

    @Test void given_BiggerThan4Rule_LessThan6Rule_when_And_then_passed_result_5() {
        And<SourceInput> rule5 = new And<SourceInput>()
                .addRule(new BiggerThan4Rule())
                .addRule(new LessThan6Rule());
        
        assertTrue(rule5.isSatisfied(new SourceInput(2, 3)));
        assertFalse(rule5.isSatisfied(new SourceInput(2, 2)));
        assertFalse(rule5.isSatisfied(new SourceInput(3, 3)));
    }

    @Test void given_BiggerThan8Rule_LessThan6Rule_when_Or_then_7_exclude() {
        Or<SourceInput> ruleExclude7 = new Or<SourceInput>()
                .addRule(new BiggerThan8Rule())
                .addRule(new LessThan6Rule());

        assertFalse(ruleExclude7.isSatisfied(new SourceInput(4, 3)));
        assertTrue(ruleExclude7.isSatisfied(new SourceInput(5, 5)));
        assertTrue(ruleExclude7.isSatisfied(new SourceInput(2, 2)));
    }
}
