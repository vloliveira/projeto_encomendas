package chegouAqui.service;

import chegouAqui.entity.Administrador;
import chegouAqui.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {
    private final AdministradorRepository repository;

    public AdministradorService(AdministradorRepository repository){
        this.repository = repository;
    }

    public List<Administrador> listarTodos(){
        return repository.findAll();
    }
    public Administrador salvar(Administrador administrador) {
        return repository.save(administrador);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
