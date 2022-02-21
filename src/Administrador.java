public class Administrador extends Empregado{
    private float ajudadeCusto;
    private float obtersalarioadm;

    public float getAjudadeCusto() {
        return ajudadeCusto;
    }

    public void setObtersalarioadm(float obtersalarioadm) {
        this.obtersalarioadm = obtersalarioadm;
    }

    public void setAjudadeCusto(float ajudadeCusto) {
        this.ajudadeCusto = ajudadeCusto;
    }
    void salarioadm(){
        System.out.println("O salario do administrador é de : R$"+obtersalarioadm);
    }
}
