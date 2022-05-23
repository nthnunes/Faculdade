import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        Scanner scan = new Scanner(System.in);
        int opc, cont = 1000;
        String nome, temp = null;

        banco.Cadastrar(new Cliente("Nathan Nunes", "001.002.003-44", "Rua Lauro Mascarin", "43991931210",
                    new Conta(001, "Corrente", 100f)));

        do{
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Cliente/Conta");
            System.out.println("2 - Consultar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Finalizar");
            System.out.printf("Opção: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\nTipo de conta:\n1 - Poupança\n2 - Corrente");
                    System.out.printf("Opção: ");
                    int aux = Integer.parseInt(scan.next());
                    if(aux == 1){
                        temp = "Poupança";
                    }
                    else if(aux == 2){
                        temp = "Corrente";
                    }
                    else{
                        System.out.println("Valor inválido, tente novamente.");
                        break;
                    }
                    System.out.printf("Nome: ");
                    nome = scan.nextLine();
                    System.out.printf("CPF: ");
                    String cpf = scan.next();
                    scan.next();
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
                    System.out.printf("Qual nome que deseja encontrar: ");
                    if(banco.Consultar(scan.nextLine()) == null){
                        System.out.println("Cliente não encontrado.\n");
                        break;
                    }
                    Cliente cliente = banco.Consultar(scan.nextLine());
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Endereço: " + cliente.getEndereco());
                    System.out.println("Telefone: " + cliente.getConta());
                    System.out.println("Conta: " + cliente.getConta().getNumero());
                    break;
                case 3:
                    System.out.printf("Nome completo de quem receberá o depósito: ");
                    nome = scan.nextLine();
                    System.out.printf("Valor do depósito: ");
                    banco.Depositar(nome, scan.nextFloat());
                    break;
                case 4:
                    System.out.printf("Seu nome completo: ");
                    nome = scan.nextLine();
                    System.out.printf("Valor do saque: ");
                    banco.Sacar(nome, scan.nextFloat());
                    break;
                case 5:
                    System.out.printf("Seu nome completo: ");
                    nome = scan.nextLine();
                    System.out.printf("Nome de quem irá receber a transferência: ");
                    temp = scan.nextLine();
                    System.out.printf("Valor da transferência: ");
                    banco.Transferir(nome, temp, scan.nextFloat());
                    break;
                case default:
                    if(opc == 6){
                        break;
                    }
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }while(opc != 6);
    }
}