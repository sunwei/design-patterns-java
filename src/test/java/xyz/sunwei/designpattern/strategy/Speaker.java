package xyz.sunwei.designpattern.strategy;

public class Speaker {
    private Strategy strategy;
    
    public Speaker(Strategy languageStrategy){
        this.strategy = languageStrategy;
    }
    
    public void changeStrategy(Strategy languageStrategy){
        this.strategy = languageStrategy;
    }
    
    public void sayHi(){
        this.strategy.execute();
    }
}
