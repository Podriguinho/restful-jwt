package restful.autenticacao.csce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restful.autenticacao.csce.model.ContaModel;
import restful.autenticacao.csce.services.ContaService;

@RestController
@RequestMapping("/api/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping("/salvar")
    public ResponseEntity<ContaModel> salvar(@RequestBody ContaModel conta){

        return ResponseEntity.ok(contaService.save(conta));
    }

}
