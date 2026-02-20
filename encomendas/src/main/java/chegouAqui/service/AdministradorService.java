package chegouAqui.service;

import chegouAqui.entity.Administrador;
import chegouAqui.repository.AdministradorRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {
    private final AdministradorRepository repository;
    private final PasswordEncoder passwordEncoder;

    public AdministradorService(AdministradorRepository repository, PasswordEncoder passwordEncoder){
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Administrador> listarTodos(){
        return repository.findAll();
    }
    public Administrador salvar(Administrador administrador) {
        administrador.setSenha(passwordEncoder.encode(administrador.getSenha())); 
        return repository.save(administrador);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
