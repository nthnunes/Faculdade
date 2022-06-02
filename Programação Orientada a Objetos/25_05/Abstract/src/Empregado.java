public abstract class Empregado {
    private int nro;
    private String nome;

    public Empregado(int nro, String nome){
        this.nro =  nro;
        this.nome = nome;
    }

    public int getNro(){
        return this.nro;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract float getSalario();
}