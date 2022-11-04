public class ProdutoTestar {

    public static void main(String[] args) {

        //construtor padrão:

        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        //construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta Vermelha", "faber");
        p2.valor = 1.69f;

        //construtor de três parâmetros:
        Produto p3 = new Produto ("Borracha", "Mercur",1.89f);

        //objeto p1
        System.out.println("nome "+p1.nome+" Marca "+p1.marca+" e custa "+p1.valor);

        System.out.println("nome "+p2.nome+" Marca "+p2.marca+" e custa "+p2.valor);

        System.out.println("nome "+p3.nome+" Marca "+p3.marca+" e custa "+p3.valor);

    }
}
