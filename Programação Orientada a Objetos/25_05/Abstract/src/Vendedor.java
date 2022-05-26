public class Vendedor extends Empregado{
    private float salarioBase, valorVendasMes, porcentagemComissao;

    public Vendedor(int nro, String nome){
        super(nro, nome);
    }

    public void setSalarioBase(float s){

    }

    // in progress
    public float getSalario(){
        return this.salarioBase;
    }
}