public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void tocar() {
		System.out.println("Tocando a música selecionada.");
	}

    @Override
	public void pausar() {
		System.out.println("Pausando a música atual.");
	}

    @Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música na lista.");
	}
	
    @Override
	public void exibirPagina(String url) {
		
		System.out.println("Exibindo a página atual.");
	}
	
    @Override
	public void adicionarNovaAba() {
		
		System.out.println("Adicionando nova aba de navegação.");
	}
	
    @Override
	public void atualizarPagina() {
		
		System.out.println("Atualizando a página atual.");
	}
	
    @Override
	public void ligar(String numero) {
		
		System.out.println("Ligando para o número discado ou contato selecionado.");
	}
	
    @Override
	public void atender() {
		
		System.out.println("Atendendo a ligação.");
	}

    @Override
	public void iniciarCorreioVoz() {
		
		System.out.println("Iniciando o correio de voz.");
	}

}