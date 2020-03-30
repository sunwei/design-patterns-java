package xyz.sunwei.designpattern.strategy;

public class EnglishStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}
