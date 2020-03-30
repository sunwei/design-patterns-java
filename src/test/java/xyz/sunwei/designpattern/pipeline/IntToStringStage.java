package xyz.sunwei.designpattern.pipeline;

import java.util.logging.Logger;

public class IntToStringStage implements Stage<Integer, String> {
    public static final Logger LOGGER = Logger.getLogger("IntToStringStage.class");

    @Override
    public String process(Integer input) {
        String output = input.toString();
        LOGGER.info(
                String.format("Current stage: %s, input is %d of type %s, output is %s, of type %s",
                        "IntToStringStage", input, "Integer", output, String.class)
        );
        return output;
    }
}
