package edu.leopoldo.conteudo.gettersesetters.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome="Felipe";
        felipe.idade= 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
        //RESULTANDO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}
