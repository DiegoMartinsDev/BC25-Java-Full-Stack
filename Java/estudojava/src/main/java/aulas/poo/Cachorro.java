package aulas.poo;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso,String comidaFavorita, String raca){
        super(nome,idade,peso); // super chama da classe pai
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
    @Override //sobrescreve uma ação
    public void fazerSom(){

        System.out.println("Au au");
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void dormir(){
        System.out.println("Estou acordado");
    }


    public void setPeso(double novoPeso) {
        super.setPeso(novoPeso);
    }
    @Override
    public void comer(String comida) {
        if (comida.equals(this.comidaFavorita)) {
            super.comer(comida);
        } else {
            System.out.println("Quero" + comida + "Não");
        }
    }




    public static void main(String[] args) {
        Pet pet1 = new Pet("Fred",3,12.5);
        pet1.dormir();
        pet1.comer("Osso");

                Cachorro batata = new Cachorro("Rex",5,25,"Osso","Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Osso");
        batata.setPeso(20);
        batata.brincar();
        batata.dormir();
    }
}
