public class App {
    public static void main(String[] args) throws Exception {
        Pessoa x = new Pessoa("Nathan");

        System.out.println("\n--> Informações <--");
        System.out.println("Nome: " + x.getNome());
        System.out.println("Telefone: " + x.getTelefone());
        System.out.println("Idade: " + x.getIdade());
        System.out.println("");

        x.setTelefone();
        x.setIdade();

        System.out.println("\n--> Informações Atualizadas <--");
        System.out.println("Nome: " + x.getNome());
        System.out.println("Telefone: " + x.getTelefone());
        System.out.println("Idade: " + x.getIdade());
    }
}
