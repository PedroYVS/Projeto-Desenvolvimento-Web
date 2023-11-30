package fatec.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatec.backend.entities.CestaEntity;
import fatec.backend.services.CestaService;

@RestController
@CrossOrigin("*")
public class CestaController {
    @Autowired
    CestaService service;

    @GetMapping("/api/cesta/item/{codigo}")
    public ResponseEntity<Optional<CestaEntity>> pesquisar(@PathVariable long codigo){
        return ResponseEntity.ok(service.pesquisar(codigo));
    }

    @GetMapping("/api/cesta/itens")
    public ResponseEntity<List<CestaEntity>> listar(){
        return ResponseEntity.ok(service.listar());
    }
    
    @PostMapping("/api/cesta")
    public ResponseEntity<String> inserirItem(@RequestBody CestaEntity obj){
        service.salvar(obj);
        return ResponseEntity.ok("Item inserido com sucesso");
    }

     @PutMapping("/api/cesta")
    public ResponseEntity<String> atualizarItem(@RequestBody CestaEntity obj){
        service.salvar(obj);
        return ResponseEntity.ok("Item atualizado com sucesso");
    }

    @DeleteMapping("/api/cesta/remover/{codigo}")
    public ResponseEntity<String> remover(@PathVariable long codigo){
        service.removerItem(codigo);
        return ResponseEntity.ok("Item removido com sucesso");
    }

    @DeleteMapping("/api/cesta/limpar")
    public ResponseEntity<String> limpar(){
        service.limparCesta();
        return ResponseEntity.ok("Cesta limpa com sucesso");
    }
}
