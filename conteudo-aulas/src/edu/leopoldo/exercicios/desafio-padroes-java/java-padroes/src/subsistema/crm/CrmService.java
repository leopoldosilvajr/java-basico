package subsistema.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CEP do cliente: " + cep);
        System.out.println("Cidade do cliente: " + cidade);
        System.out.println("Estado do cliente: " + estado);
    }
}
