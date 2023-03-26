package restful.autenticacao.csce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import restful.autenticacao.csce.model.ContaModel;

import java.util.UUID;

public interface ContaRepository extends JpaRepository<ContaModel, UUID> {


}
