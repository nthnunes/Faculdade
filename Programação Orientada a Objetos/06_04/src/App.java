import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Produto a = new Produto("Mouse", 149.99f, 10);
        Fabricante b = new Fabricante("Fabricante Teste", "Rua Teste", "12345678");
        int opc;

        a.setFabrica(b);
        do{
            System.out.println("--> Menu <--");
            System.out.println("1 - Vender Produto");
            System.out.println("2 - Repor Produto");
            System.out.println("3 - Exibir  Dados");
            System.out.println("4 - Sair");
            System.out.printf("Opção: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    System.out.printf("Quantidade vendida: ");
                    if(a.vender(scan.nextInt())){
                        System.out.println("Venda registrada!");
                        break;
                    }
                    System.out.println("Não há produtos em estoque suficientes.");
                    break;
                case 2:
                    System.out.printf("Quantidade a ser reposta: ");
                    a.repor(scan.nextInt());
                    break;
                case 3:
                    System.out.println("\nProduto: " + a.getDescricao());
                    System.out.println("Preço: " + a.getPreco());
                    System.out.println("Quantidade Disponível: " + a.getQntd());
                    System.out.println("Fabricante: " + a.getFabricante().getNome());
                    System.out.println("Endereço Fabricante: " + a.getFabricante().getEndereco());
                    System.out.println("Telefone Fabricante: " + a.getFabricante().retornaFone());
                    break;
                default:
                    if(opc != 4){
                        System.out.println("Opção inválida, tente novamente!");
                    }
                    break;
            }
            System.out.println("");
        }while(opc != 4);
        
    }
}