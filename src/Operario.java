public class Operario extends Empregado{
    private float valorProd;
    private float comissao;
    private float salario;

    void dadosoperario(){
        System.out.println("O operario : "+getNome()+", produziu :"+valorProd+", resultando em uma comissao de : "+comissao);
        System.out.println("O salario foi para : "+salario);
    }
    public float getValorProd() {
        return valorProd;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "valorProd=" + valorProd +
                ", comissao=" + comissao +
                ", salario=" + salario +
                '}';
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setValorProd(float valorProd) {
        this.valorProd = valorProd;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
