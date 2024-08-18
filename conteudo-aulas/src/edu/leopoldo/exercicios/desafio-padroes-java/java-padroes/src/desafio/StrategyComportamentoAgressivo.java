package desafio;

public class StrategyComportamentoAgressivo implements Strategy {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

}