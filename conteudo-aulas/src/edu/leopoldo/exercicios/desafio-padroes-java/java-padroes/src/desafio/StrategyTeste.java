package desafio;

public class StrategyTeste {

    // Testando padrões de design Java Strategy
    
    public static void main(String[] args) {
        Strategy normal = new StrategyComportamentoNormal();
        Strategy defensivo = new StrategyComportamentoDefensivo();
        Strategy agressivo = new StrategyComportamentoAgressivo();

        StrategyRobo robo = new StrategyRobo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();
        System.out.println();
        System.out.println("Troca de movimento para defensivo");
        System.out.println();

        robo.setStrategy(defensivo);

        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println();
        System.out.println("Troca de movimento para agressivo");
        System.out.println();

        robo.setStrategy(agressivo);
        robo.mover();
    }

}
