package aulas.Estoque;

import java.time.LocalDate;

public class TesteControleEstoque {

    public static void main(String[] args) {

        ControleEstoque estoque = new ControleEstoque();

        estoque.setIdProduto(1);
        estoque.setLote(1201);
        estoque.setQualidade("Dentro da validade");
        estoque.setQuantidade(10);
        estoque.setValidade( LocalDate.of(2022,12,12));

        estoque.aumentarQtd (830); // aumenta o estoque

        estoque.diminuirQTD(0);  // diminui o estoque

        System.out.println(
                "Estoque atual do produto com id " +estoque.getIdProduto()+
                " é de :"+estoque.getQuantidade()+
                " unidades, com validade até "+estoque.getValidade()+
                ". Registrado em lote "+estoque.getLote()+
                " está "+estoque.getQualidade()); //mostra o estoque atual
    }
}
