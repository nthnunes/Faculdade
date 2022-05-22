public class Cliente {
    private String nome, cpf, endereco, telefone;
    private Conta conta;

    public Cliente(String nome, String cpf, String endereco, String telefone, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.conta = conta;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public Conta getConta() {
        return this.conta;
    }
}