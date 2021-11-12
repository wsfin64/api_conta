package br.edu.ifpb.contavirtual.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="conta")
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    private Long nconta;

    private Double saldo;


    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "conta")
    private Correntista correntista;

    public Conta(Long id, Long nconta, Double saldo){
        this.id = id;
        this.nconta = nconta;
        this.saldo = saldo;
//        this.correntista = new Correntista();
    }

    public Conta(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNconta() {
        return nconta;
    }

    public void setNconta(Long nconta) {
        this.nconta = nconta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
}
