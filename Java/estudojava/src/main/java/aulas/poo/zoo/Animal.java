package aulas.poo.zoo;

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}
class Gato implements Animal{
    @Override
    public void dormir(){
        System.out.println("zzzzzzzzz");
    }

    @Override
    public void fazerSom(){
        System.out.println("miau");
    }

    @Override
    public void comer(String comida){
        if(comida.equals("Peixe")){
            System.out.println("Agora sim, peixe");
        }else{
            System.out.println("Não como "+comida+" Só como peixe");
        }
    }
}

class Galinha implements Animal{
@Override
public void dormir(){
        System.out.println("Sou Galinha e estou dormindo zzzzzz");
        }
        @Override
        public void fazerSom(){
        System.out.println("có có có có");
        }


        @Override
        public void comer(String comida){
        System.out.println("hummmmm estou comendo " + comida);
        }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("milho");

        gato.comer("Peixe");
        gato.fazerSom();
        gato.dormir();

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println("=====Polimrfismo =======");
        animalGalinha.fazerSom();
        animalGalinha.dormir();
        animalGalinha.comer("Alpiste");
        System.out.println(" ======================== ");
        animalGatinho.fazerSom();
        animalGatinho.dormir();
        animalGatinho.comer("Peixe");


    }

        }