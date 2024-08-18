package desafio;

public class StrategyComportamentoNormal implements Strategy {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

}
