import java.util.Scanner;

abstract class CofresSeguros {
  protected String tipo;
  protected String metodoAbertura;

  public CofresSeguros(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends CofresSeguros {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends CofresSeguros {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      scanner.nextLine();
      CofreDigital cofre = new CofreDigital(senha);
      cofre.imprimirInformacoes();
      int confirmarSenha = scanner.nextInt();
      if (cofre.validarSenha(confirmarSenha)) {
          System.out.println("Cofre aberto!");
      } else {
          System.out.println("Senha incorreta!");
      }
  }
  if (tipoCofre.equalsIgnoreCase("fisico")){
      CofreFisico cofreFisico = new CofreFisico();
      cofreFisico.imprimirInformacoes();
  }

    // Fechar o scanner para evitar vazamentos de recursos
    scanner.close();
 }
}