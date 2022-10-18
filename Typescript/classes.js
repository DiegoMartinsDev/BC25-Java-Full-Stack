"use strict";
class Cachorro {
    /*
    nome:string
    raca:string
    cor:string
    idade:number
    peso:number
    altura:number
    morde:boolean
    vacinado:boolean
    pedigree:boolean */
    constructor(nome, raca, cor, idade, peso, altura, morde, vacinado, pedigree) {
        /*
    this.nome = nome
    this.raca = raca
    this.cor = cor
    this.idade = idade
    this.peso = peso
    this.altura = altura
    this.morde = morde
    this.vacinado = vacinado
    this.pedigree = pedigree */
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.morde = morde;
        this.vacinado = vacinado;
        this.pedigree = pedigree;
    }
    somar(a, b) {
        return a + b;
    }
}
let c = new Cachorro('rex', 'rotvailer', 'azul', 4, 40, 1.7, false, false, false);
let c2 = new Cachorro('rex', 'rotvailer', 'azul', 4, 40, 1.7, false, false, false);
console.log(c);
