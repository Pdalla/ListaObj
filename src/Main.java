import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Scanner teclado = new Scanner(System.in);
        pessoa.pessoacont("Jose Pereira Fausto");
        pessoa.pessoacte("12 999-888-7777","Rua Jose Pereira");
        pessoa.funcionariodados();
        fornecedor.setNome("Linx");
        fornecedor.setEndereco("Rua Bonita");
        fornecedor.setTelefone("4112-1212");
        fornecedor.funcionariodados();
        fornecedor.setValorCredito(1000);
        fornecedor.setValorDivida(500);
        fornecedor.setObterSaldo(fornecedor.getValorCredito() - fornecedor.getValorDivida());
        fornecedor.fornecedorsaldo();
        empregado.setNome(" Joao");
        empregado.setSalarioBase(1500.00F);
        empregado.setImposto(empregado.getSalarioBase()*0.2f);
        empregado.empregadodados();
        administrador.setAjudadeCusto(1500);
        administrador.setObtersalarioadm(empregado.getSalarioBase()+ administrador.getAjudadeCusto());
        administrador.salarioadm();


    }
}
