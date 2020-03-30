package xyz.sunwei.designpattern.strategy;

public class ChineseStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("你好");
    }
}
