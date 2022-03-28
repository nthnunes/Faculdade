import java.util.Scanner;

public class Pessoa {
    private String nome, telefone;
    private int idade;

    public Pessoa(String nome, String telefone, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setTelefone(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu telefone: ");
        this.telefone = scan.next();
    }

    public void setIdade(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        this.idade = scan.nextInt();
    }
}
