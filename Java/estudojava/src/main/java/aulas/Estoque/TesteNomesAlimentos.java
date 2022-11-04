package aulas.Estoque;

public class TesteNomesAlimentos {
    public static void main(String[] args) {

        NomesAlimentos alimentos = new NomesAlimentos();
        alimentos.setIdProduto (1);
        alimentos.setNome("Laranja");
        alimentos.setPeso(55.333f);
        alimentos.setTipo("fruta");


        System.out.println(alimentos.getPeso());

        alimentos.setPeso(200.500f);
    }



}
