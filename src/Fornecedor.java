public class Fornecedor extends Usuario {

	private Loja loja = new Loja();

	private Produto produto = new Produto();

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getNomeLoja() {
		return loja.getNome();
	}

	public String getCnpjLoja(){
		return loja.getCnpj();
	}

	public String getLocalizacaoLoja(){
		return loja.getLocalizacao();
	}


	public String getNomeProduto() {
		return produto.getNome();
	}

	public double getPrecoProduto(){
		return produto.getPreco();
	}

	public int getDisponibilidadeProduto(){
		return produto.getDisponibilidade();
	}


	public void cadastrarLoja(String nome, String cnpj, String localizacao) {
		this.loja.setNome(nome);
		this.loja.setCnpj(cnpj);
		this.loja.setLocalizacao(localizacao);

	}

	public void cadastrarProduto(String nome, double preco, int disponibilidade) {
		this.produto.setNome(nome);
		this.produto.setPreco(preco);
		this.produto.setDisponibilidade(disponibilidade);
	}



}
