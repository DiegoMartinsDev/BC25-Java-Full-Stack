package aulas.Estoque;

public class NomesAlimentos {

    private int idProduto;
    private String nome;
    private float peso;
    private String tipo;


    public void setPeso(float peso) {
        if (peso >= 0 && peso <= 100.000) {
            this.peso = peso;
            System.out.println("Peso modificado para: ");
        } else {
            System.out.println("Peso não modificado. Carga  ultrapassa 100.000kg");
        }
    }
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    //public void setPeso(float peso) {
       // this.peso = peso;
    //}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    NomesAlimentos(){

    }
    NomesAlimentos(int idProduto,String nome,float peso,String tipo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.peso=peso;
        this.tipo = tipo;
    }
    void aumentaPeso(float pesagem){ //aumenta o peso
        peso += pesagem;

    }
    void diminuiPeso(float pesagem) { // diminui o peso
        peso -= pesagem;
    }
}
