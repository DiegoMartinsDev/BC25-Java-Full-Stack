package org.soulcodeacademy.empresa.domain;

import javax.persistence.*;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProjeto;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double funcionario;

    @Column(nullable = false, length = 200)
    private String descricao;

    public Projeto(){

    }

    public Projeto(Integer idProjeto, String nome, Double funcionario, String descricao) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.funcionario = funcionario;
        this.descricao = descricao;
    }

    public Integer getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Double funcionario) {
        this.funcionario = funcionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


