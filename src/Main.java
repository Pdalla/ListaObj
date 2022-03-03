import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Operario operario = new Operario();
        Scanner teclado = new Scanner(System.in);


            //CLASSE PESSOA
            System.out.println("Digite o nome da Pessoa");
                pessoa.setNome(teclado.next());
            System.out.println("Digite o numero de contato:");
                pessoa.setTelefone(teclado.next());
            System.out.println("Digite o endereco:");
                pessoa.setEndereco(teclado.next());
                pessoa.funcionariodados();
            //FORNECEDOR
        System.out.println("Dados do FORNECEDOR:");
        fornecedor.setNome("Linx");
        fornecedor.setEndereco("Rua Bonita");
        fornecedor.setTelefone("4112-1212");
        fornecedor.funcionariodados();
        fornecedor.setValorCredito(1000);
        fornecedor.setValorDivida(500);
        fornecedor.setObterSaldo(fornecedor.getValorCredito() - fornecedor.getValorDivida());
        fornecedor.fornecedorsaldo();


            //CLASSE EMPREGADO
            System.out.println("Digite o nome do empregado:");
            empregado.setNome(teclado.next());
            empregado.setSalarioBase(1500.00F);
            System.out.println("Digite o endereco do empregado:");
            empregado.setEnderecoo(teclado.next());
            System.out.println("Digite o endereco do telefone:");
            empregado.setTelefonee(teclado.next());
            empregado.setImposto(empregado.getSalarioBase()*0.2f);
            System.out.println("Digite o codigo do setor da pessoa");
            empregado.setCodigoSetor(teclado.nextInt());
            if (empregado.getCodigoSetor()==1){
                empregado.setSalarioBase(1700);
            }
            else if (empregado.getCodigoSetor()==2){
                empregado.setSalarioBase(2000);
            }
            else  if (empregado.getCodigoSetor()==3){
                empregado.setSalarioBase(2200);
            }
            empregado.empregadodados();
        //DADOS CHEFIA
        System.out.println("DADOS DO CHEFE");
        administrador.setAjudadeCusto(1500);
        administrador.setObtersalarioadm(empregado.getSalarioBase() + administrador.getAjudadeCusto());
        administrador.salarioadm();
            System.out.println("Digite o nome do operario:");
            operario.setNome(teclado.next());
            System.out.println("Digite o setor do operario:");
            operario.setCodigoSetor(teclado.nextInt());
            operario.setValorProd(1525);
            operario.setComissao(operario.getValorProd()/100);
            operario.setSalario(empregado.getSalarioBase() + operario.getComissao());
            operario.dadosoperario();
    }
}
