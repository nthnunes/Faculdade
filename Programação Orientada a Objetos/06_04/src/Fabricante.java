public class Fabricante {
    private String nome;
    private String endereco;
    private String telefone;

    public Fabricante(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void atualizaFone(String telefone){
        this.telefone = telefone;
        System.out.println("Telefone atualizado com sucesso!");
    }

    public String retornaFone(){
        return this.telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
}