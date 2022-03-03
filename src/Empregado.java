import com.sun.source.doctree.SinceTree;

import java.util.stream.Stream;

public class Empregado extends  Pessoa{
    private int codigoSetor;
    private float salarioBase;
    private float imposto;
    private String enderecoo;
    private String telefonee;

    public String getEnderecoo() {
        return enderecoo;
    }

    public void setEnderecoo(String enderecoo) {
        this.enderecoo = enderecoo;
    }

    public String getTelefonee() {
        return telefonee;
    }

    public void setTelefonee(String telefonee) {
        this.telefonee = telefonee;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    public  void Empregado (){
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", enderecoo='" + enderecoo + '\'' +
                ", telefonee='" + telefonee + '\'' +
                '}';
    }

    @Override
    public void funcionariodados() {
        super.funcionariodados();
    }
        void empregadodados(){
        System.out.println("O setor do empregado "+getNome()+", é o setor:"+getCodigoSetor());
        System.out.println("Seu salario base é : "+salarioBase);
        System.out.println("O imposto sobre seu salario resulta em: R$"+imposto);
    }
}
