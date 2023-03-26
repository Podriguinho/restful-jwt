package restful.autenticacao.csce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restful.autenticacao.csce.model.UsuarioModel;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    public Optional<UsuarioModel> findByLogin(String login);

}
