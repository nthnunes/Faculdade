public class Contato {
    private String nome, fone, data;
    public Contato(String nome, String fone, String data){
        this.nome=nome;
        this.fone=fone;
        this.data=data;
    }
    public String getNome(){
        return this.nome;
    }
    public String getFone(){
        return this.fone;
    }
    public String getData(){
        return this.data;
    }
    public void setFone(String fone){
        this.fone=fone;
    }
}
