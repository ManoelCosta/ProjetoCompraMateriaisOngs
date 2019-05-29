public class Main {
    public static void main(String[] args) {
        Gestor g1 = new Gestor();

        g1.setNome("Manoel");
        g1.setIdentificacao("666");

        g1.cadastrarOng("Maloca", "123456","Avenida asdf");
        System.out.println(g1.getNomeOng());
        System.out.println(g1.getCnpjOng());
        System.out.println(g1.getLocalizacaoOng());

        g1.cadastrarFornecedor("Marcos", "0000000000");
        System.out.println(g1.getNomeFornecedor());
        System.out.println(g1.getCpfFornecedor());

        g1.getFornecedor().cadastrarLoja("Tio do chopp", "7852", "Avenida hellblaze");
        System.out.println(g1.getFornecedor().getNomeLoja());
        System.out.println(g1.getFornecedor().getCnpjLoja());
        System.out.println(g1.getFornecedor().getLocalizacaoLoja());

        g1.getFornecedor().cadastrarProduto("Chopp de chocolate", 1.50, 10);
        System.out.println(g1.getFornecedor().getNomeProduto());
        System.out.println(g1.getFornecedor().getPrecoProduto());
        System.out.println(g1.getFornecedor().getDisponibilidadeProduto());



    }
}
