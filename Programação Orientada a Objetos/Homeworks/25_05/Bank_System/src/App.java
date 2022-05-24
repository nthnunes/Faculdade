import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        Scanner scan = new Scanner(System.in);
        int opc, cont = 1000;
        String nome, temp = null;

        do{
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Cliente/Conta");
            System.out.println("2 - Consultar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Finalizar");
            System.out.printf("Opção: ");
            opc = Integer.parseInt(scan.next());

            switch(opc){
                case 1:
                    while(true){
                        System.out.println("\nTipo de conta:\n1 - Poupança\n2 - Corrente");
                        System.out.printf("Opção: ");
                        int aux = Integer.parseInt(scan.next());
                        if(aux == 1){
                            temp = "Poupança";
                            break;
                        }
                        else if(aux == 2){
                            temp = "Corrente";
                            break;
                        }
                        else{
                            System.out.println("--> Valor inválido, tente novamente.");
                        }
                    }
                    scan.nextLine();
                    System.out.printf("\nNome: ");
                    nome = scan.nextLine();
                    System.out.printf("CPF: ");
                    String cpf = scan.next();
                    scan.nextLine();
                    System.out.printf("Endereço: ");
                    String endereco = scan.nextLine();
                    System.out.printf("Telefone: ");
                    String telefone = scan.nextLine();
                    System.out.printf("Saldo: ");
                    float saldo = scan.nextFloat();

                    banco.Cadastrar(new Cliente(nome, cpf, endereco, telefone,
                        new Conta(cont+100, temp, saldo)));
                    break;
                case 2:
                    scan.nextLine();
                    System.out.printf("Qual nome que deseja encontrar: ");
                    temp = scan.nextLine();
                    if(banco.Consultar(temp) == null){
                        System.out.println("--> Cliente não encontrado.\n");
                        break;
                    }
                    Cliente cliente = banco.Consultar(temp);
                    System.out.println("\n--> Cliente encontrado!");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Endereço: " + cliente.getEndereco());
                    System.out.println("Telefone: " + cliente.getTelefone());
                    System.out.println("Número da Conta: " + cliente.getConta().getNumero());
                    System.out.println("Saldo: " + cliente.getConta().getSaldo());
                    System.out.println("");
                    break;
                case 3:
                    scan.nextLine();
                    System.out.printf("Nome completo de quem receberá o depósito: ");
                    nome = scan.nextLine();
                    System.out.printf("Valor do depósito: ");
                    if(banco.Depositar(nome, scan.nextFloat())){
                        System.out.println("--> Depósito efetuado com sucesso!\n");
                        break;
                    }
                    System.out.println("--> Cliente não encontrado.\n");
                    break;
                case 4:
                    scan.nextLine();
                    System.out.printf("Nome completo da conta de saque: ");
                    nome = scan.nextLine();
                    System.out.printf("Valor do saque: ");
                    if(banco.Sacar(nome, scan.nextFloat())){
                        System.out.println("--> Saque efetuado com sucesso!\n");
                        break;
                    }
                    System.out.println("--> Não foi possível efetuar o saque.\n");
                    break;
                case 5:
                    scan.nextLine();
                    System.out.printf("Nome da conta a efetuar a transferência: ");
                    nome = scan.nextLine();
                    System.out.printf("Nome de quem irá receber: ");
                    temp = scan.nextLine();
                    System.out.printf("Valor da transferência: ");
                    if(banco.Transferir(nome, temp, scan.nextFloat())){
                        System.out.println("--> Transferência efetuada com sucesso!\n");
                        break;
                    }
                    System.out.println("--> Não foi possível efetuar a transferência.\n");
                    break;
                default:
                    if(opc == 6){
                        break;
                    }
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }while(opc != 6);
    }
}