public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private static int contador = 0;

    public Cliente() {
        contador++;
    }

	public static int getContador() {
        return contador;
    }

}