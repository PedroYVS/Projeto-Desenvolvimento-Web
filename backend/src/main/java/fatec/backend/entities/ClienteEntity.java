package fatec.backend.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Id
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String tel;
}
