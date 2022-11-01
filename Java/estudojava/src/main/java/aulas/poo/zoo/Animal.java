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
            System.out.println("Só como peixe");
        }
    }
}

class Galinha implements Animal{
@Override
public void dormir(){
        System.out.println("co có zzzzzz");
        }
        @Override
        public void fazerSom(){
        System.out.println("co có có có");
        }


        @Override
        public void comer(String comida){
        System.out.println("hummmmm co có" + comida);
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
    }

        }