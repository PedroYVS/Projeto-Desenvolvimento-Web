package fatec.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fatec.backend.classes.PedidoId;
import fatec.backend.entities.PedidoEntity;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, PedidoId>, JpaSpecificationExecutor<PedidoEntity>{
    @Query(value = "select * from pedidos where codigo_pedido=?1 or codigo_produto=?1", nativeQuery = true)
    List<PedidoEntity> pesquisar(long procura);
}
