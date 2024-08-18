package leopoldo.silva.projeto.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import leopoldo.silva.projeto.spring.model.Cliente;

@Service
public interface ClienteService {

    List<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
	
}