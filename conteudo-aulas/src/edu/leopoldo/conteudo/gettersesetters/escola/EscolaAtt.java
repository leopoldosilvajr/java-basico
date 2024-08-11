package edu.leopoldo.conteudo.gettersesetters.escola;

public class EscolaAtt {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(35);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
        //RESULTANDO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}
