package fatec.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.backend.entities.PedidoEntity;
import fatec.backend.repositories.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repo;

    public void salvar(PedidoEntity obj){
        repo.save(obj);
    }

    public List<PedidoEntity> pesquisar(long procura){
        return repo.pesquisar(procura);
    }

    public List<PedidoEntity> listar(){
        return repo.findAll();
    }
}
