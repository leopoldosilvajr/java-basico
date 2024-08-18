package desafio;

public class StrategyRobo {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void mover() {
        strategy.mover();
    }
}
