public class Cachorro extends Animal{
    private String nome, raca;

    public Cachorro(String tipo, String cor, String nome, String raca) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }
    
    public void exibirNomeRaca(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
    }
}