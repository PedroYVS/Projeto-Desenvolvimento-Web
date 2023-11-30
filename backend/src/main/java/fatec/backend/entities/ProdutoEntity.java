package fatec.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "produtos")
public class ProdutoEntity {
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Id
    @Column(name = "codigo_produto")
    private long codigoProduto;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fabricante")
    private String fabricante;
    @Column(name = "preco")
    private int preco;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "imagem")
    private String imagem;
}
