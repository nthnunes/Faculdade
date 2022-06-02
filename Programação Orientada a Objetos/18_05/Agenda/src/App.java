import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda contatos=new Agenda();
        Scanner teclado=new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Agenda\n1-Cadastrar\n2-Consultar"+
                              "\n3-Atualizar\n4-Excluir\n5-Finalizar"+
                              "\nOpção: ");
            opcao=teclado.nextInt();
            teclado.nextLine();
            switch(opcao){
                case 1: String nome, fone, data;
                        System.out.println("Nome: ");
                        nome=teclado.nextLine();
                        System.out.println("Telefone: ");
                        fone=teclado.nextLine();
                        System.out.println("Data de aniversario: ");
                        data=teclado.nextLine();
                        contatos.incluiContato(nome, fone, data);
                        break;
                case 2: System.out.println("Nome para consultar: ");
                        nome=teclado.nextLine();
                        Contato c=contatos.consultaContato(nome);
                        if(c!=null)
                            System.out.println("Nome: "+c.getNome()+
                                "\nFone: "+c.getFone()+
                                "\nData aniversário: "+c.getData());
                        else 
                            System.out.println("Contato inexistente!");
                        break;
                case 3: System.out.println("Nome para atualizar: ");
                        nome=teclado.nextLine();
                        System.out.println("Telefone: ");
                        fone=teclado.nextLine();
                        if(contatos.atualizaContato(nome, fone))
                            System.out.println("Contato atualizado!");
                        else 
                            System.out.println("Contato inexistente!");
                        break;
                case 4: System.out.println("Nome para excluir: ");        
                        nome=teclado.nextLine();
                        if(contatos.excluiContato(nome))
                            System.out.println("Contato excluído!");
                        else 
                            System.out.println("Contato inexistente!");
                case 5: break;
                default: System.out.println("Opção inválida!");
            }
        }while(opcao!=5); 
	}
}