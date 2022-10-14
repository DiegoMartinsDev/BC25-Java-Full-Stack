let end = {
        rua: 'Dona Gertrudes',
        numero: 456,
        estado: 'SP',
        complemento:'Sem Complemento',
        cep:'08235-555',
}
let pessoa = {
    nome: "Gendalf",
    idade: 180,
    cpf: "000.555.888-99",
    altura: 196,
    endereco: { ...end },
    solteiro: true,
    habilidades: ['React','Java','python'],
    cumprimentar(){
        console.log(`olá tudo bem? Meu nome é ${this.nome}`)
    }
}
/*console.log(end)
console.log(pessoa.endereco.estado)
pessoa.cumprimentar()
pessoa.nome = 'Pablo Escobar'
pessoa.cumprimentar()
pessoa.habilidades.push('Angular')
console.log(pessoa.habilidades)
console.log(pessoa['cpf'])*/
console.log(end.rua)
console.log(pessoa.endereco.rua)
pessoa.endereco.rua='Rua Secundária'

console.log(pessoa.endereco.rua)
console.log(end.rua)

