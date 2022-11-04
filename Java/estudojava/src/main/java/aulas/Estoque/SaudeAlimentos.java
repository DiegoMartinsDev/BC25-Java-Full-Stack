package aulas.Estoque;

public class SaudeAlimentos{

    private String tipo;
    private String cor;
    private String aspecto;
    private String tamanho;
    private float peso;
    private float valor;
    private int idProduto;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCor() {
        return cor;
    }

    public String getAspecto() {
        return aspecto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public float getPeso() {
        return peso;
    }

    public float getValor() {
        return valor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setPeso(float peso) {
        if (peso >= 0 && peso <= 100.000) {
            this.peso = peso;
            System.out.println("Peso modificado para: ");
        } else {
            System.out.println("Peso não modificado. Carga  ultrapassa 100.000kg");
        }
    }

    SaudeAlimentos(){

    }
    SaudeAlimentos(
            String tipo,
            String cor,
            String aspecto,
            String tamanho,
            float peso,
            float valor,
            int idProduto
    ){

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

