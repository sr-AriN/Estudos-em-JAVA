package com.example.padroesdeprojetospring.service.Implementacao;

import com.example.padroesdeprojetospring.model.Cliente;
import com.example.padroesdeprojetospring.service.ClienteService;

import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplementacao implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }

}
