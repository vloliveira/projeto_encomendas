package chegouAqui.service;

import org.springframework.stereotype.Service;

import chegouAqui.dto.LoginDTO;
import chegouAqui.entity.Administrador;
import chegouAqui.repository.AdministradorRepository;

@Service
public class AuthService {
    private final AdministradorRepository  adminRepository;

    public AuthService(AdministradorRepository adminRepository){
        this.adminRepository = adminRepository;
    }
    public boolean autenticar(LoginDTO loginDTO){
        Administrador admin = adminRepository.findByLogin(loginDTO.getUsuario()).orElse(null);
        if (admin == null){
            return false;
        }return admin.getSenha().equals(loginDTO.getSenha());
    }
}
