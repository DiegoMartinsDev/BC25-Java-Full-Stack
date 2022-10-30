package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
   String nome;
   String sobrenome;
   int idade;
   double altura;
   double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

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

   void mostrarImc(){
      double imc = this.peso / (this.altura * this.altura);
      System.out.println("o imc é "+ imc);
   }

   double calculaImc(){
      double imc = this.peso / (this.altura*this.altura);
      return imc;

   }
   void comer(String comida){
      System.out.println("Estou comendo "+ comida);
      this.peso += 1.5;
   }
   
   void cumprimentar(Pessoa pessoa){
      this.dizOla();
      pessoa.dizOla();
      
      if(!this.conhecePessoa(pessoa)){
         this.addPessoaNova(pessoa);
         pessoa.addconhecePessoa(this);
      }
   }

   private void addconhecePessoa(Pessoa pessoa) {
   }

   private void addPessoaNova(Pessoa pessoa) {
   }

   void addPessoa(Pessoa pessoa){
      System.out.println(this.nome + " conheceu "+ pessoa.nome +"!!!");
      this.conhecidos.add(pessoa);
   }
   boolean conhecePessoa(Pessoa pessoa){
      return this.conhecidos.contains(pessoa);
   }


}
