class Cachorro{
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

    constructor(
        public nome:string, 
        public raca:string, 
        public cor:string, 
        public idade:number, 
        public peso:number, 
        public altura:number, 
        public morde:boolean, 
        public vacinado:boolean, 
        public pedigree:boolean
        )
        {
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

    }
    somar(a:number, b:number):number{
        return a+b
    }

    }


let c = new Cachorro('rex', 'rotvailer','azul',4,40, 1.7,false,false,false)
let c2 = new Cachorro('rex', 'rotvailer','azul',4,40, 1.7,false,false,false)
console.log(c)
