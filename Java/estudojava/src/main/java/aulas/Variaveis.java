package aulas;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        int idade = 20; //inteiro
        double salario = 4500.99; //dupla precisão
        float nota = 7.5f;
        long populacaTerra = 7_000_000_000l;
        boolean tarefaConcluida = false; //true ou false
        int i = 1, j = 0, k = 1000; // multiplas variáveis
        String nomeCompleto = "Diego Martins";

        int teste = 10;
        teste = 9; // reatribuição de variáveis
        final int teste2 = 200; //impossível mudar o valor com final

        int a = 5;
        int b = 10;

        int soma = a + b;
        int subtração = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("o resultado da divisao é: " + multiplicacao);

        float sete = 7f;
        float dois = 2f;

        System.out.println(sete / dois);

        double x = Math.sqrt(144);
        double y = Math.pow(5, 2);
        System.out.println(Math.PI);

        //casting != converte a variável
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado = sete / (double) dois; // 7 / 2.0 = 3.5

        //Operadores 2

        int valor = 5;
        valor++;
        valor--;
        valor+= 10;

        // Operadores relacionais

        boolean teste1 = 5>1; //true
        boolean teste3 = 5<1; //false
        boolean teste4 = 5==5; // true
        boolean teste5 = 5!=1; // true
        boolean teste6 = 6>=6; // true
        boolean teste7 = 5<=9; // true


        // operadores lógicos

        boolean teste8 = true && false; //false
        boolean teste9 = true || false; // true
        boolean teste10 = (5>10) && (10<5); //false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5>1);
        boolean teste13 = !teste12; //false

    }

}
