package aulas.poo;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehflex;
    int qtPortas;
    double combustivelAtual;
    double consumo;
    boolean estaLigado;

    //Construtor

    Carro(String modelo, String marca, int ano, boolean ehflex, int qtPortas, double combustivelAtual, double consumo, boolean estaLigado){


             this.modelo = modelo;
             this.marca = marca;
             this.ano = ano;
             this.ehflex =  ehflex;
             this.qtPortas = qtPortas;
             this.combustivelAtual = 30.0;
             this.consumo = consumo;
             this.estaLigado = false;
    }
    //Abastecer
              void abastecer(double total){
               this.combustivelAtual += total;
    }
    //ligar
    void ligar(){
        this.estaLigado = true;
    }
    //desligar
    void Desligar(){
        this.estaLigado = false;
    }
    //viajar
    boolean viajar(String local, double distancia){
        if (this.estaLigado ){
            this.ligar();
        }
        //Calcula quantos litros são necessários

        double totalLitros = distancia / this.consumo;

        if (this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ "+local+" aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true; //a viagem aconteceu
        } else{
            System.out.println("A viagem não aconteceu.");
            return false; // a viagem não será possível
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4,40);
        Carro carro2 = new Carro("PP","MERCEDES",2022,false,2,50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual); // mostra com 35 l

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2022;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("São Paulo", 3000);
        System.out.println(viajou);

    }
}