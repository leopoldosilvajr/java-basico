package desafio;

public class SingletonLazyTeste {
    public static void main(String[] args) {

        // Testando padrões de design Java Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    }
}
