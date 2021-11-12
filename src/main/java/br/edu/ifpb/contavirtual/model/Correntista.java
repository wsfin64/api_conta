package br.edu.ifpb.contavirtual.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="correntista")
public class Correntista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private String nome;
    private String cpf;
    private String telefone;
    private String bairro;
    private String cidade;
    private String estado;

    @OneToOne(optional=false, orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="idConta", referencedColumnName = "id")
    private Conta conta;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
