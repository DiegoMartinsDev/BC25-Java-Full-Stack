public class CarroTestar {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        c1.acelerar(20);
        c1.freiar(30);
        c1.acelerar(50);
        c1.freiar(90);

        System.out.println(c1.vel);
    }
}
