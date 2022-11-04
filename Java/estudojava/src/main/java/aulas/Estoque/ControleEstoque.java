package aulas.Estoque;

import javax.print.DocFlavor;
import java.time.LocalDate;

public class ControleEstoque {
    //atributos

    int idProduto;
    int lote;
    LocalDate validade;
    String Qualidade;
    int quantidade;

    //construtore
    ControleEstoque() {
    }
    ControleEstoque(int idProduto,int lote, LocalDate validade,String Qualidade, int quantidade){
        this.idProduto = idProduto;
        this.lote = lote;
        this.validade = validade;
        this.Qualidade = Qualidade;
        this.quantidade = quantidade;
    }

    //métodos
    void aumentarQtd(int qtd) {      //aumenta o estoque
        quantidade +=qtd;
    }
    void diminuirQTD(int qtd) {      //diminui o estoque
        quantidade -=qtd;
    }
}

