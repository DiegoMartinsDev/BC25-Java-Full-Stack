package aulas.Estoque;

public class TesteSaudeAlimentos {

    public static void main(String[] args) {
        SaudeAlimentos saude = new SaudeAlimentos();

        saude.setTipo("Fruta");
        saude.setCor("laranja");
        saude.setAspecto("Bom");
        saude.setTamanho ("P");
        saude.setPeso (55.333f); // peso não pode ultrapassar 100.000
        saude.setValor (55.90f);
        saude.setIdProduto (1);

        System.out.println("Peso da carga é de "+saude.getPeso()+" KG.");


        saude.setPeso(70.300f);

        System.out.println(saude.getPeso());

        saude.setPeso(80.700f);

        System.out.println(saude.getPeso());

        saude.setPeso(113.000f); //peso não pode ultrapassar 100.000



    }
}

