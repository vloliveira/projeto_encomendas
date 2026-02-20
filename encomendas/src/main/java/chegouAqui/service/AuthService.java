package chegouAqui.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import chegouAqui.dto.LoginDTO;
import chegouAqui.entity.Administrador;
import chegouAqui.repository.AdministradorRepository;

@Service
public class AuthService {
    private final AdministradorRepository  adminRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(AdministradorRepository adminRepository, PasswordEncoder passwordEncoder){
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public boolean autenticar(LoginDTO loginDTO){
        Administrador admin = adminRepository.findByLogin(loginDTO.getUsuario()).orElse(null);
        if (admin == null){
            return false;
        }return passwordEncoder.matches(loginDTO.getSenha(), admin.getSenha());
    }
}
