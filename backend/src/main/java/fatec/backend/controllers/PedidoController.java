package fatec.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatec.backend.entities.PedidoEntity;
import fatec.backend.services.PedidoService;

@RestController
@CrossOrigin("*")
public class PedidoController {
    @Autowired
    PedidoService service;

    @GetMapping("/api/pedidos/{procura}")
    public ResponseEntity<List<PedidoEntity>> pesquisar(@PathVariable long procura){
        return ResponseEntity.ok(service.pesquisar(procura));
    }

    @GetMapping("/api/pedidos")
    public ResponseEntity<List<PedidoEntity>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping("/api/pedido/historico")
    public ResponseEntity<String> salvar(@RequestBody PedidoEntity obj){
        service.salvar(obj);
        return ResponseEntity.ok("Pedido adicionado ao histórico");
    } 
}
