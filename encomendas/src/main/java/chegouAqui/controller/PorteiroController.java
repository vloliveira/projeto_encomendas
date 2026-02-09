package chegouAqui.controller;


import chegouAqui.entity.Porteiro;
import chegouAqui.service.PorteiroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/porteiros")
public class PorteiroController {
    private final PorteiroService service;

    public PorteiroController (PorteiroService service){
        this.service = service;
    }

    @GetMapping
    public List<Porteiro> listarTodos(){
        return service.listarTodos();
    }
    @PostMapping
    public Porteiro salvar(@RequestBody Porteiro porteiro){
        return service.salvar(porteiro);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
