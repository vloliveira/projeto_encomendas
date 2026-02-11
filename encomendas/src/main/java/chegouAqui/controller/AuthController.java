package chegouAqui.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import chegouAqui.dto.LoginDTO;
import chegouAqui.service.AuthService;



@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        if (authService.autenticar(loginDTO)){
            return ResponseEntity.ok("Login realizado com sucesso!");
        }
        return ResponseEntity.status(401).body("Credenciais inválidas!");
    }
    
}
