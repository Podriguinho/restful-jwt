package restful.autenticacao.csce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restful.autenticacao.csce.model.ContaModel;
import restful.autenticacao.csce.repository.ContaRepository;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;


    public ContaModel save(ContaModel conta) {
        return contaRepository.save(conta);


    }
}
