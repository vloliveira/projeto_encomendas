package chegouAqui.service;

import chegouAqui.entity.Encomendas;
import chegouAqui.repository.EncomendasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncomendasService {
    private final EncomendasRepository repository;

    public EncomendasService (EncomendasRepository repository){
        this.repository = repository;
    }

    public List<Encomendas> listarTodos(){
        return repository.findAll();
    }
    public Encomendas salvar(Encomendas encomendas){
        return repository.save(encomendas);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }

}
