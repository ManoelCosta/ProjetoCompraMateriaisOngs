public class Ong extends Usuario {
    private double saldo;


    Ong(String cnpj) {
        this.setIdentificacao(cnpj);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
