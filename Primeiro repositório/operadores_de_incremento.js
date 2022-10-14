alert("código funcionando!")
const nomeUsuario = prompt("Olá, usuário, qual o seu nome")//mostra uma mensagem e recebe um valor

let num = Number(prompt("Olá, " + nomeUsuario + ". Diegite algum número, por favor:"))
console.log(typeof num) //retorna o tipo de valor que a variável armzena

//operadores de incremento

const sucessor = num++ // =num + 1

alert('O sucessor de ' +num+ "é" + sucessor)
console.log(num++) // operador de pós incremento
console.log(num)
console.log(++num) // operador de pré incremento