"use strict";
const p = {
    altura: 1.9,
    nome: 'Faustão',
    idade: 12,
    cpf: '222.222.222-22',
    rg: '22222222222222',
    solteiro: true,
    habilidades: ['HTML'],
    endereco: {
        rua: 'Rua Bacana',
        cep: '12345-000',
        complemento: 'Apartamento',
        estado: 'PE',
        numero: 789
    },
    cumprimentar() {
        console.log('Saudações, meu nome pe:' + this.nome);
    }
};
const p2 = {
    nome: 'Paula',
    altura: 1.7,
    idade: 24,
    cpf: '222.222.222-00',
    habilidades: ['HTML'],
    endereco: {
        estado: 'CE',
        rua: 'Rua no Ceará',
        complemento: 'Complemento não sei',
        numero: 607,
        cep: '44400-000'
    },
    rg: '0002222888888',
    solteiro: false,
    cumprimentar() {
        console.log('olá para todos' + this.nome);
    }
};
