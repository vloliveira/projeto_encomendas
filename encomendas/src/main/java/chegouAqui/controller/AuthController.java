package chegouAqui.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import chegouAqui.dto.LoginDTO;



@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        
        if (loginDTO.getEmail().equals("admin@email.com")
                && loginDTO.getSenha().equals("123")) {

            return ResponseEntity.ok("Login realizado com sucesso");
        }

        return ResponseEntity.status(401).body("Credenciais inválidas");
    }
    
}
