package fatec.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import fatec.backend.entities.CestaEntity;

@Repository
public interface CestaRepository extends JpaRepository<CestaEntity, Long>, JpaSpecificationExecutor<CestaEntity>{
    
}
