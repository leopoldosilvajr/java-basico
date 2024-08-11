public class Main {
	public static void main(String[] args) {
		
		System.out.println("""
                                   Verificar o extrato dos clientes.
                                   Digite abaixo o nome dos clientes: """);
		System.out.println("Clientes informados: \n - Leopoldo \n - João");

		System.out.println();
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Leopoldo");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		cc.depositar(300);
		cc.transferir(200, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println();
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João");
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
	
		cc2.depositar(700);
		cc2.transferir(500, poupanca);
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		System.out.println();
		System.out.println("== Contagem de clientes do banco ==");
        System.out.println("O total de clientes cadastrados é de " + Cliente.getContador() + " cliente(s)");
	}
}

// ideias que quero colocar em prática
// adicionar variável abaixo
// double limiteSaqueDiario = 500;
/*  
É para definir um limite de saque diário, quero que quando algum saque solicitado for maior que o limite diário, seja impresso uma mensagem de aviso, mas para isso é necessário estrututar a classe conta
	double valorSaqueCliente1 = 60;
		if (valorSaqueCliente1 <= limiteSaqueDiario) {
			cc.sacar(valorSaqueCliente1);
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Transação não realizada. O valor do saque excede o limite de 500.");
		}
*/