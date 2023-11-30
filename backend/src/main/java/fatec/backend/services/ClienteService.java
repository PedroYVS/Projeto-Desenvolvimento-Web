package fatec.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.backend.entities.ClienteEntity;
import fatec.backend.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public void cadastrar(ClienteEntity obj){
        repo.save(obj);
    }

    public Optional<ClienteEntity> fazerLogin(String email, String senha){
        return repo.fazerLogin(email, senha);
    }
}
