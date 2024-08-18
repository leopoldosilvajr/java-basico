package desafio;

public class StrategyComportamentoDefensivo implements Strategy {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

}