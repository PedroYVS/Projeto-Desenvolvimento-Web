package fatec.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cesta")
public class CestaEntity {
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Id
    @Column(name = "codigo_produto")
    private long codigoProduto;
    @Column(name = "preco_unitario")
    private int precoUnitario;
    @Column(name = "quantidade")
    private int quant;
}
