package com.chegouAqui.encomendas.service;


import com.chegouAqui.encomendas.entity.Porteiro;
import com.chegouAqui.encomendas.repository.PorteiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PorteiroService {
    private final PorteiroRepository repository;

    public PorteiroService (PorteiroRepository repository){
        this.repository = repository;
    }
    public List<Porteiro> listarTodos(){
        return repository.findAll();
    }
    public Porteiro salvar(Porteiro porteiro){
        return repository.save(porteiro);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
