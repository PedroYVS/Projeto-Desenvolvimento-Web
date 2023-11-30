package fatec.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fatec.backend.entities.ProdutoEntity;
import fatec.backend.services.ProdutoService;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping("/api/produto/{codigo}")
    public ResponseEntity<Optional<ProdutoEntity>> pesquisarEspecifico(@PathVariable long codigo){
        return ResponseEntity.ok(service.pesquisarEspecifico(codigo));
    }

    @GetMapping("/api/produtos/{busca}")
    public ResponseEntity<List<ProdutoEntity>> pesquisarLista(@PathVariable String busca){
        return ResponseEntity.ok(service.pesquisarLista(busca));
    }

    @GetMapping("/api/produtos")
    public ResponseEntity<List<ProdutoEntity>> listar(){
        return ResponseEntity.ok(service.listar());
    }

}
