package com.chegouAqui.encomendas.controller;

import com.chegouAqui.encomendas.entity.Admnistrador;
import com.chegouAqui.encomendas.service.AdmnistradorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admnistradores")
public class AdmnistradorController {
    private final AdmnistradorService service;

    public AdmnistradorController(AdmnistradorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Admnistrador> listarTodos(){
        return service.listarTodos();
    }
    @PostMapping
    public Admnistrador salvar(@RequestBody Admnistrador admnistrador){
        return service.salvar(admnistrador);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
