import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        int opc = 0;

        do{
            System.out.println("Agenda:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Finalizar");
            System.out.printf("Opção: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\n*** ADICIONAR CONTATO ***");
                    System.out.printf("Nome: ");
                    String nome = scan.nextLine();
                    System.out.printf("Telefone: ");
                    String fone = scan.next();
                    System.out.printf("Data do Aniversário: ");
                    String dt = scan.next();
                    agenda.inclueContato(nome, fone, dt);
                    System.out.printf("--> Contato incluído com sucesso!\n\n");
                    break;
                case 2:
                    System.out.printf("*** CONSULTAR CONTATO ***");
                    System.out.printf("Nome: ");
                    nome = scan.nextLine();
                    Contato c = agenda.consultarContato(nome);
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Telefone: " + c.getFone());
                    System.out.println("Data de Aniversário: " + c.getDataAniversario());
                    break;
                case 3:
                    System.out.printf("*** ATUALIZAR CONTATO ***");
                    System.out.printf("Nome: ");
                    nome = scan.nextLine();
                    if(agenda.consultarContato(nome) != null){
                        System.out.printf("Novo Telefone: ");
                        fone = scan.next();
                        agenda.atualizaContato(nome, fone);
                        System.out.printf("--> Contato atualizado com sucesso!\n\n");
                    }
                    else{
                        System.out.printf("--> Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.printf("*** ATUALIZAR CONTATO ***");
                    System.out.printf("Nome: ");
                    nome = scan.nextLine();
                    boolean status = agenda.excluiContato(nome);
                    if(status == true){
                        System.out.printf("--> Contato excluído com sucesso!\n\n");
                    }
                    else{
                        System.out.printf("--> Contato não encontrado.");
                    }
                    break;
            }
        }while(opc != 5);
    }
}