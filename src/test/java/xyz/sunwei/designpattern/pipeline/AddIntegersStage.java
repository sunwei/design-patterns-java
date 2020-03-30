package xyz.sunwei.designpattern.pipeline;

import xyz.sunwei.designpattern.SourceInput;

import java.util.logging.Logger;

public class AddIntegersStage implements Stage<SourceInput, Integer> {
    public static final Logger LOGGER = Logger.getLogger("AddIntegersStage.class");
    
    @Override
    public Integer process(SourceInput input) {
        Integer output = input.int1 + input.int2;
        LOGGER.info(
                String.format("Current stage: %s, input is %s of type %s, output is %s, of type %s",
                        "AddIntegersStage", input.toString(), "ExamplePipeline", output, Integer.class)
        );
        return output;
    }
}
