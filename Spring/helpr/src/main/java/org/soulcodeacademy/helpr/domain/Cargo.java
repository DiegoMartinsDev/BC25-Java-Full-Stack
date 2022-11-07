package org.soulcodeacademy.helpr.domain;


import javax.persistence.*;

@Entity //Transforma a classe em uma tabela do banco
public class Cargo { // nome da tabela vai ser cargo
    @Id  //usa o atributo abaixo como chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Integer idCargo; // será a chave primaria

    @Column(nullable = false, length = 50) // not nul e com 50 caracteres no máximo
    private String nome;

    @Column(nullable = false, length = 120)
    private String descricao;

    @Column(nullable = false)
    private Double salario;


    public Cargo(){  // ORM musará este com get e set

    }

    public Cargo(Integer idCargo, String nome, String descricao, Double salario) {
        this.idCargo = idCargo;
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
