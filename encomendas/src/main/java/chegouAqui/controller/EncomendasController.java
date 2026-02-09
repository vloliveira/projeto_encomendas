package chegouAqui.controller;


import chegouAqui.entity.Encomendas;
import chegouAqui.service.EncomendasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encomendas")
public class EncomendasController {
    private final EncomendasService service;
    public EncomendasController(EncomendasService service){
        this.service = service;
    }

    @GetMapping
    public List<Encomendas> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Encomendas salvar(@RequestBody Encomendas encomendas){
        return service.salvar(encomendas);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
