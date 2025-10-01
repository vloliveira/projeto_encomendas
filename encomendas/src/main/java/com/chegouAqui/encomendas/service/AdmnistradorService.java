package com.chegouAqui.encomendas.service;

import com.chegouAqui.encomendas.entity.Admnistrador;
import com.chegouAqui.encomendas.repository.AdmnistradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmnistradorService {
    private final AdmnistradorRepository repository;

    public AdmnistradorService (AdmnistradorRepository repository){
        this.repository = repository;
    }

    public List<Admnistrador> listarTodos(){
        return repository.findAll();
    }
    public Admnistrador salvar(Admnistrador admnistrador) {
        return repository.save(admnistrador);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
