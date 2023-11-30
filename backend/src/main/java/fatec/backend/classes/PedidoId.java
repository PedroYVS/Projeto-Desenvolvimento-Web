package fatec.backend.classes;

import java.io.Serializable;

import fatec.backend.entities.ClienteEntity;
import fatec.backend.entities.ProdutoEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PedidoId implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_pedido")
    private long codigoPedido;
    @ManyToOne
    @JoinColumn(name = "codigo_produto")
    private ProdutoEntity produto;
    @ManyToOne
    @JoinColumn(name = "cpf_cliente")
    private ClienteEntity cliente;
}
