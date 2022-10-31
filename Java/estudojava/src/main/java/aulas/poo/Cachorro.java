package aulas.poo;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso,String comidaFavorita, String raca){
        super(nome,idade,peso); // super chama da classe pai
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
    @Override
    public void fazerSom(){
        System.out.println("Au au");
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Fred",3,12.5);
        pet1.dormir();
        pet1.comer("batata");

                Cachorro batata = new Cachorro("Rex",5,25,"Osso","Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("feião");
        batata.setPeso(20);
    }
}
