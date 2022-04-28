public class Animal {
    private String tipo, cor;

    public Animal(String tipo, String cor){
        this.tipo =  tipo;
        this.cor =  cor;
    }

    public void exibirTipoCor(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
    }
}