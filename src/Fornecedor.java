public class Fornecedor extends Usuario {

    private Loja loja;
    private Produto produto;

    Fornecedor(String cnpj) {
        this.setIdentificacao(cnpj);
    }

    void cadastrarLoja(String nome, String localizacao, String cnpj) {
        this.loja.setNome(nome);
        this.loja.setLocalizacao(localizacao);
        this.loja.setCnpj(cnpj);
    }

    public Produto getProduto() {
        return produto;
    }

    public void cadastrarProduto(String nome, double preco, int disponibilidade, int codigo) {
        this.produto.setNome(nome);
        this.produto.setPreco(preco);
        this.produto.setDisponibilidade(disponibilidade);
        this.produto.setCodigo(codigo);
    }

    void mostrarNomeLoja(){
        loja.getNome();
    }
    void mostrarLocalizacaoLoja(){
        loja.getLocalizacao();
    }
    void mostrarCnpjLoja(){
        loja.getCnpj();
    }

}
