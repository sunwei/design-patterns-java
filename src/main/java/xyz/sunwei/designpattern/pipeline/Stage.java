package xyz.sunwei.designpattern.pipeline;

public interface Stage<I, O> {
    O process(I input);
}
