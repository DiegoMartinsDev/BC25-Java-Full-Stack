package aulas.correcao;

import java.util.Scanner;

public class Correcao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual sua idade");
        int idade = entrada.nextInt();

        if(idade<18){
            System.out.println("vocêé menor de idade");
        } else {
            System.out.println("Você é maior20 de idade");
        }
    }
}
