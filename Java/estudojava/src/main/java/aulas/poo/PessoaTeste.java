package aulas.poo;

public class PessoaTeste {
    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       pessoa1.nome = "Diego";
       pessoa1.sobrenome = "Martins";
       pessoa1.idade = 28;
       pessoa1.peso = 80;
       pessoa1.altura = 1.90;

       pessoa1.dizOla();
       Pessoa pessoa2 = new Pessoa();
       Pessoa pessoa3 = new Pessoa();
       System.out.println(pessoa2.nome);

       Pessoa pessoa4 = new Pessoa("Francileide","Perdigão",35,1.75,30.5);

       Pessoa recemNascido = new Pessoa("Enzo", "Perez");

       System.out.println(recemNascido.altura);
       recemNascido.idade++;
       recemNascido.dizOla();
       pessoa1.dizOla();
       pessoa4.dizOla();


    }
}
