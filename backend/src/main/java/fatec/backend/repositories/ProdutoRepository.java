package fatec.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fatec.backend.entities.ProdutoEntity;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>, JpaSpecificationExecutor<ProdutoEntity> {
    @Query(value = "select * from produtos where nome_produto=?1 or categoria=?1 or tipo=?1 or fabricante=?1", nativeQuery = true)
    List<ProdutoEntity> procurar(String busca);
}
