package fatec.backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatec.backend.entities.ClienteEntity;
import fatec.backend.services.ClienteService;

@RestController
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping("/api/cliente")
    public ResponseEntity<String> cadastrar(@RequestBody ClienteEntity obj){
        service.cadastrar(obj);
        return ResponseEntity.ok("Cliente cadastrado com sucesso");
    }

    @GetMapping("/api/cliente/login/{email}/{senha}")
    public ResponseEntity<ClienteEntity> fazerLogin(@PathVariable String email, @PathVariable String senha){
        ClienteEntity obj = new ClienteEntity();
        Optional<ClienteEntity> retorno = service.fazerLogin(email, senha);
        if(retorno.isPresent()) obj = retorno.get();
        return ResponseEntity.ok(obj);
    }

}
