import java.util.Scanner;

public class CalculadoraIMC {
       public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);


            System.out.println("Qual seu nome: ");
            String nome = entrada.nextLine();

           System.out.println("Qual a sua idade");
           int idade = entrada.nextInt();

           System.out.println("Qual a sua altura (m)");
           double altura = entrada.nextDouble();

           System.out.println("Qual o seu peso?(kg)");
           double peso = entrada.nextDouble();


           double IMC = peso / (altura * altura);

           System.out.println("Olá, meu nome é " + nome + " e tenho " +idade+ " anos");
           System.out.println("Meu IMC é: " + IMC );
           System.out.printf("Este é o seu IMC = %.3f\n", IMC);
           System.out.printf("Olá,meu nome é %s e tenho %d anos \n", nome, idade);

           if(IMC<17){
               System.out.println("Muito abaixo do peso");
           }else if(IMC >= 17 && IMC <= 18.49)  {
               System.out.println("Abaixo do peso");
           }else if(IMC >= 18.5 && IMC <= 24.99){
               System.out.println("Peso Normal");
           }else if(IMC == 25 && IMC <= 29.99)  {
               System.out.println("Acima do peso");
           }else if(IMC >= 35 && IMC <=34.99)    {
               System.out.println("Obesidade I ");
           }else if (IMC >= 35 && IMC <= 39.99)   {
               System.out.println("Obesidade II (severa)");
           }else {
               System.out.println("Obesidade III (morbida)");
           }
           }
       }



