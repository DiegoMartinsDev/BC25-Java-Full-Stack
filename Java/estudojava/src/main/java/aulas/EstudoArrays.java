package aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[]args){
        int[] numeros = {1,2,3,4,5};
        System.out.println(numeros.length);
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("A posição "+i+ " com valor de " + numeros[i]);
        }
        int[] numeros2 = new int[50];
        numeros2[0] = 500;
        numeros2[1] = -200;

        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"Diego Martins","Juan Gonzalez", "Victorio Santin"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];
    }

}
