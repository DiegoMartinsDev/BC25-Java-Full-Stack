package aulas.correcao;

import java.util.Scanner;

public class Correcao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for (int i = 0; i < tamanho; i++) {
            v2[i] = entrada.nextInt();
        }
        int encontros  = 0;

        for(int i = 0; i < tamanho; i++){
            if (v1[i] == v2[i]){
                encontros++;
            }
        }
          System.out.println("Foram "+encontros+" encontrados(s)");
    }

}
