/*let pessoa = {
    nome:'Pietro',
    idade: 22,
    altura: 1.8,
    cpf: '111.111.111-11',
    solteiro: false,
    habilidades: ['Java','Angular','Typescript','javascript','Node.js','Spring Boot']
    endereco:{
        rua: 'Rua Feliz',
        numero: 567,
        estado: 'CE',
        complemento: 'Sem Complemento',
        cep: '12300-000'
    }
}


let pessoa2 = {
    nome:'Pietro',
    idade: 22,
    altura: 1.8,
    cpf: '111.111.111-11',
    solteiro: false,
    habilidades: ['Java','Angular','Typescript','javascript','Node.js','Spring Boot']
    endereco:{
        rua: 'Rua Feliz',
        numero: 567,
        estado: 'CE',
        complemento: 'Sem Complemento',
        cep: '12300-000'
    }
    rg:12345678989-9
}
*/
interface Endereco{
    rua: string
    numero: number
    estado:string
    complemento: string
    cep:string
}

interface Pessoa{
    nome:string
    idade:number
    altura: number
    cpf: string
    solteiro:boolean
    habilidades: string[]
    endereco: Endereco
    rg: string
    cumprimentar():void
}

const p: Pessoa = {
    altura :1.9,
    nome: 'Faustão',
    idade: 12,
    cpf: '222.222.222-22',
    rg:'22222222222222',
    solteiro: true,
    habilidades :['HTML'],
    endereco:{
        rua: 'Rua Bacana',
        cep: '12345-000',
        complemento: 'Apartamento',
        estado:'PE',
        numero: 789
    },
    cumprimentar(){
        console.log('Saudações, meu nome pe:'+ this.nome)
    }
}

const p2:Pessoa ={
    nome:'Paula',
    altura:1.7,
    idade:24,
    cpf:'222.222.222-00',
    habilidades :['HTML'],
    endereco: {
        estado: 'CE',
        rua: 'Rua no Ceará',
        complemento: 'Complemento não sei',
        numero:607,
        cep:'44400-000'
    }
    ,rg: '0002222888888',
    solteiro: false,
    cumprimentar(){
        console.log('olá para todos'+this.nome)
    }
}