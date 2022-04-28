public class Aluno {
    private String ra, nome;
    private Nota notas;

    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.notas = new Nota();
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Nota getNotas() {
        return notas;
    }
}