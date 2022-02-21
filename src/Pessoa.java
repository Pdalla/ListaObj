public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void pessoacont (String nome){
        this.nome = nome;
    }
    public void pessoacte (String telefone, String endereco){
        this.telefone = telefone;
        this.endereco = endereco;
    }
    void funcionariodados(){
        System.out.println("O nome completo ou nome fantasia : "+ nome);
        System.out.println("O endereco é : "+ endereco);
        System.out.println("O contato é : "+ telefone);
    }
}
