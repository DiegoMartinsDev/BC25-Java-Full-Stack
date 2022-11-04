package aulas.Estoque;

import javax.print.DocFlavor;
import java.time.LocalDate;

public class ControleEstoque {
    //atributos

     private int idProduto;
     private int lote;
    private LocalDate validade;
    private String Qualidade;
    private int quantidade;


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getQualidade() {
        return Qualidade;
    }

    public void setQualidade(String qualidade) {
        Qualidade = qualidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

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

