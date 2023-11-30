package fatec.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.backend.entities.ProdutoEntity;
import fatec.backend.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    public Optional<ProdutoEntity> pesquisarEspecifico(long codigo){
        return repo.findById(codigo);
    }

    public List<ProdutoEntity> pesquisarLista(String busca){
        return repo.procurar(busca);
    }

    public List<ProdutoEntity> listar(){
        return repo.findAll();
    }
}
