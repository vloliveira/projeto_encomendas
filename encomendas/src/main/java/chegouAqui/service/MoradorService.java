package chegouAqui.service;

import chegouAqui.entity.Morador;
import chegouAqui.repository.MoradorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Anotação que diz ao Spring: “crie e gerencie uma instância desta classe como um bean”.
        // Permite injeção dessa classe em outros componentes (por exemplo no Controller).
public class MoradorService {
    private final MoradorRepository repository;

    public MoradorService(MoradorRepository repository){
        this.repository = repository;
    }
    public List<Morador> listarTodos(){
        return repository.findAll();
    }
    public Morador salvar(Morador morador){
        return repository.save(morador);
    }

    /* Agora temos apenas a função deletar que só executa e  não retorna nada.
    Ela é diferente das outras acima pois busca pelo id, otimizando o código, não tem necessidade de
    ler tod0 o morador para encontrar ele. */
    public void deletar(Long id){
        repository.deleteById(id);
    }

}
