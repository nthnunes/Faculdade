public class Contato {
    private String nome, fone, dataAniversario;

    public Contato(String nome, String fone, String dataAniversario){
        this.nome = nome;
        this.fone = fone;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFone() {
        return this.fone;
    }

    public String getDataAniversario() {
        return this.dataAniversario;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}