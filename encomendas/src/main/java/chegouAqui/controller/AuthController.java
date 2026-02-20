package chegouAqui.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import chegouAqui.dto.LoginDTO;
import chegouAqui.security.TokenService;



@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    

    public AuthController(AuthenticationManager authenticationManager, TokenService tokenService){
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        UsernamePasswordAuthenticationToken userNamePassword = new UsernamePasswordAuthenticationToken(
            loginDTO.getUsuario(),
            loginDTO.getSenha()
        );
        
        var auth = this.authenticationManager.authenticate(userNamePassword);
        String token = tokenService.generateToken(((org.springframework.security.core.userdetails.User) auth.getPrincipal()).getUsername());

        return ResponseEntity.ok(token);
    }
    
}
