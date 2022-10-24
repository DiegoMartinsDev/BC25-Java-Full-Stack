import java.util.Scanner;

public class CalculadoraIMC {
       public static void main(String[] args){
           Scanner entrada = new Scanner(System.in);
           System.out.println("Qual seu nome?");
           String nome = entrada.nextLine();

           System.out.println("Qual sua idade?");
           int idade = entrada.nextInt();

           System.out.println("Qual sua altura");
           double altura = entrada.nextDouble();

           System.out.println("Olá eu sou "+nome+" e tenho "+idade+" anos e tenho "+altura+" de altura.");

           }
}



