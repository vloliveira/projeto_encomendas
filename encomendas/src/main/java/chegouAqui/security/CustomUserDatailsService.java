package chegouAqui.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import chegouAqui.entity.Administrador;
import chegouAqui.entity.Porteiro;
import chegouAqui.repository.AdministradorRepository;
import chegouAqui.repository.PorteiroRepository;

@Service
public class CustomUserDatailsService implements UserDetailsService{
    private final AdministradorRepository adminRepository;
    private final PorteiroRepository porteiroRepository;
    
    public CustomUserDatailsService(AdministradorRepository adminRepository, PorteiroRepository porteiroRepository){
        this.adminRepository = adminRepository;
        this.porteiroRepository = porteiroRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<Administrador> admin = adminRepository.findByLogin(username);
        if(admin.isPresent()){
            return User
            .withUsername(admin.get().getLogin())
            .password(admin.get().getSenha())
            .roles("ADMIN")
            .build();
        }

        Optional<Porteiro> porteiro = porteiroRepository.findByLogin(username);
        if(porteiro.isPresent()){
            return User
            .withUsername(porteiro.get().getLogin())
            .password(porteiro.get().getSenha())
            .roles("PORTEIRO")
            .build();
        }
        
        throw new UsernameNotFoundException("Usuário não encontrado: " + username);
        
    }
}
