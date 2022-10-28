package aulas.poo;

public class Pessoa {
   String nome;
   String sobrenome;
   int idade;
   double altura;
   double peso;


   Pessoa(){
      this.nome = "Diego";
      this.sobrenome = "Martins";
      this.idade = 29;
      this.peso = 80;
      this.altura = 1.90;
   }

   Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.idade = idade;
      this.altura = altura;
      this.peso = peso;
   }

   Pessoa(String nome, String sobrenome){
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.idade = 0;
      this.altura = 0.5;
      this.peso = 2.0;

   }


   void dizOla(){
      System.out.println("Olá, tudo bem. Meu nome é "+this.nome);
   }


}
