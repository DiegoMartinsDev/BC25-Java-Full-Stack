package aulas.Carro2.src.Estoque;

public class NomesAlimentos {

    int idProduto;
    String nome;
    float peso;
    String tipo;

    NomesAlimentos(int idProduto,String nome,float peso,String tipo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
    }
    void aumentarPeso(float pesagem){  //aumenta o peso do lote
        peso += pesagem;
    }
    void diminuirPeso(float pesagem){   //diminui o peso do lote
        peso -= pesagem;
    }
}
