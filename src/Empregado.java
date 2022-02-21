public class Empregado extends  Pessoa{
    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    void empregadodados(){
        System.out.println("O setor do empregado :"+getNome()+" é :");
        System.out.println("Seu salario base é :"+salarioBase);
        System.out.println("O imposto sobre seu salario resulta em : R$"+imposto);
    }
}
