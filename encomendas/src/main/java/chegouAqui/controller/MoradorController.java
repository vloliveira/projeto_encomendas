package chegouAqui.controller;


import chegouAqui.entity.Morador;
import chegouAqui.service.MoradorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {
    private final MoradorService service;

    public MoradorController(MoradorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Morador> listarTodos(){
        return service.listarTodos();
    }
    @PostMapping
    public Morador salvar(@RequestBody Morador morador){
        return  service.salvar(morador);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
