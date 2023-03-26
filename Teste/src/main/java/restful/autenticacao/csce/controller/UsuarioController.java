package restful.autenticacao.csce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import restful.autenticacao.csce.model.UsuarioModel;
import restful.autenticacao.csce.repository.UsuarioRepository;


@RestController
@RequestMapping("/api/usuario")
public class    UsuarioController {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;

    public UsuarioController(UsuarioRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }


    @PostMapping("/salvar")
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return ResponseEntity.ok(repository.save(usuario));
    }

}
