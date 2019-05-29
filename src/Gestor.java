public class Gestor extends Usuario {

	private Fornecedor fornecedor = new Fornecedor();
	private Ong ong = new Ong();

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public String getNomeFornecedor() {
		return fornecedor.getNome();
	}

	public String getCpfFornecedor(){
		return fornecedor.getIdentificacao();
	}

	public String getNomeOng() {
		return ong.getNome();
	}

	public String getCnpjOng(){
		return ong.getIdentificacao();
	}

	public String getLocalizacaoOng(){
		return ong.getLocalizacao();
	}

	public void cadastrarOng(String nome, String cnpj, String localizacao) {
		this.ong.setNome(nome);
		this.ong.setIdentificacao(cnpj);
		this.ong.setLocalizacao(localizacao);
	}

	public void cadastrarFornecedor(String nome, String cpf) {
		this.fornecedor.setNome(nome);
		this.fornecedor.setIdentificacao(cpf);
	}

}
