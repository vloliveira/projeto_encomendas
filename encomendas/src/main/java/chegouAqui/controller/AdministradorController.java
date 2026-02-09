package chegouAqui.controller;

import chegouAqui.entity.Administrador;
import chegouAqui.service.AdministradorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {
    private final AdministradorService service;

    public AdministradorController(AdministradorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Administrador> listarTodos(){
        return service.listarTodos();
    }
    @PostMapping
    public Administrador salvar(@RequestBody Administrador administrador){
        return service.salvar(administrador);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
