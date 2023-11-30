package fatec.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.backend.entities.CestaEntity;
import fatec.backend.repositories.CestaRepository;

@Service
public class CestaService {
    @Autowired
    private CestaRepository repo;

    public void salvar(CestaEntity obj){
        repo.save(obj);
    }

    public Optional<CestaEntity> pesquisar(long codigo){
        return repo.findById(codigo);
    }

    public List<CestaEntity> listar(){
        return repo.findAll();
    }

    public void limparCesta(){
        repo.deleteAll();
    }

    public void removerItem(long codigo){
        repo.deleteById(codigo);
    }
}
