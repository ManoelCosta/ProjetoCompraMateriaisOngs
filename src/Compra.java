public class Compra {
    private Produto produto;
    private Ong ong;
    static double totalPreco;
    static String carrinho;

    void carrinho(){
        carrinho = produto.getNome()+" "+ carrinho;
    }

    void realizarPagamento(){
        totalPreco = produto.getPreco() + totalPreco;
        ong.setSaldo(totalPreco - ong.getSaldo());
    }
}
