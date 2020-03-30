package xyz.sunwei.designpattern.pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PipelineTests {

    @Test void given_pipeline_when_with_two_stages_then_get_string_result() {
        Pipeline<SourceInput, String> pipeline = new Pipeline<>(new AddIntegersStage())
                .addStage(new IntToStringStage());
        
        assertEquals("4", pipeline.execute(new SourceInput(1, 3)));
    }
}
