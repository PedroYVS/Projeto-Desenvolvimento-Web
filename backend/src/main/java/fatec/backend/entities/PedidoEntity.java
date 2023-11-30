package fatec.backend.entities;

import java.sql.Date;

import fatec.backend.classes.PedidoId;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;

import lombok.Data;

@Data
@Entity
@Table(name = "pedidos")
public class PedidoEntity {
    @EmbeddedId
    private PedidoId id;
    @Column(name = "preco_unitario")
    private int precoUnitario;
    @Column(name = "quantidade")
    private int quant;
    @Column(name = "valor_total")
    private int valorTotal;
    @Column(name = "data_pedido")
    private Date dataPedido;
}
