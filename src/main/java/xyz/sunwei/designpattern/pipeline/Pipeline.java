package xyz.sunwei.designpattern.pipeline;


public class Pipeline<I, O> {
    private final Stage<I, O> currentStage;

    Pipeline(Stage<I, O> currentStage) {
        this.currentStage = currentStage;
    }

    <NO> Pipeline<I, NO> addStage(Stage<O, NO> nextStage) {
        return new Pipeline<>(input -> nextStage.process(currentStage.process(input)));
    }

    O execute(I input) {
        return currentStage.process(input); // Lambda Stage
    }
}
