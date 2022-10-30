package aulas.poo;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehflex;
    int qtPortas;

    double consumo;
    double combustivelAtual;
    boolean estaLigado;

    //Construtor

    Carro(String modelo, String marca, int ano, boolean ehflex, int qtPortas, double consumo, boolean estaLigado){


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
        if (!this.estaLigado ){
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



    }
}