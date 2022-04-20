public class Motorista {
    private String cnh, categoria, nome;
    private Veiculo carro;

    public Motorista(String cnh, String categoria, String nome){
        this.cnh = cnh;
        this.categoria = categoria;
        this.nome = nome;
    }

    public String getCnh(){
        return this.cnh;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public Veiculo getCarro(){
        return this.carro;
    }

    public void setCarro(Veiculo carro){
        this.carro = carro;
    }
}