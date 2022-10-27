package aulas.correcao;

import java.util.Locale;
import java.util.Scanner;

public class Correcao1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //caso queira ler double
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n ");
        System.out.println("Digite uma opção (1 a 4): ");
        int opcao =entrada.nextInt();

        System.out.println("Digite o primeiro valor");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = entrada.nextDouble();

        switch (opcao) {
            case 1 -> {
                double soma = valor1 + valor2;
                System.out.println("O resultado da soma é " + soma);
            }


            case 2 -> {
                double subtração = valor1 + valor2;
                System.out.println("O resultado da subtração é " + subtração);
            }


            case 3 -> {
                double multiplicação = valor1 * valor2;
                System.out.println("O resultado da multiplicação é " + multiplicação);
            }


            case 4 -> {
                double divisao = valor1 / valor2;
                System.out.println("O resultado   da   divisão é " + divisao);
            }


            default -> {
                System.out.println("Você digitou um operação inválida");
            }
        }

    }
}
