package aulas.Carro2.src.Estoque;

public class SaudeAlimentos{

    String tipo;
    String cor;
    String aspecto;
    String tamanho;
    float peso;
    float valor;
    int idProduto;

    SaudeAlimentos(String tipo,String cor,String aspecto,String tamanho,float peso,float valor,int idProduto){
        this.tipo = tipo;
        this.cor = cor;
        this.aspecto = aspecto;
        this.tamanho = tamanho;
        this.peso = peso;
        this.valor = valor;
        this.idProduto = idProduto;
    }
    void aumentarPreco(float vlr){ //aumenta o preço do produto
        valor += vlr;
    }
    void diminuirPreco(float vlr){ //diminui o preço do produto
        valor -= vlr;
    }
}


