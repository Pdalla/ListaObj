
public class Fornecedor extends Pessoa {
    private float valorCredito;
    private float valorDivida;
    private float obterSaldo;

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "valorCredito=" + valorCredito +
                ", valorDivida=" + valorDivida +
                ", obterSaldo=" + obterSaldo +
                '}';
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setObterSaldo(float obterSaldo) {
        this.obterSaldo = obterSaldo;
    }

    void fornecedorsaldo(){
        System.out.println("O saldo do fonecerdor é: "+ obterSaldo);
    }


}
