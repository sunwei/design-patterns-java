package xyz.sunwei.designpattern.pipeline;


public class Pipeline<I, O> {
    private final Stage<I, O> currentStage;

    public Pipeline(Stage<I, O> currentStage) {
        this.currentStage = currentStage;
    }

    public <NO> Pipeline<I, NO> addStage(Stage<O, NO> nextStage) {
        return new Pipeline<>(input -> nextStage.process(currentStage.process(input)));
    }

    public O execute(I input) {
        return currentStage.process(input); // Lambda Stage
    }
}
