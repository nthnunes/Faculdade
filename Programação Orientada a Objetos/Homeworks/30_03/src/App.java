import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BombaCombustivel bomb = new BombaCombustivel(1, 0, 50, 5.50f);
        int opc;
        float aux;
        
        do{
            System.out.println("--> Bomba de Combustível <--\n");
            System.out.println("1 - Abastecer por Valor");
            System.out.println("2 - Abastecer por Litros");
            System.out.println("3 - Atualizar Preço");
            System.out.println("4 - Reabastecer Tanque");
            System.out.println("5 - Finalizar");

            Scanner scan = new Scanner(System.in);
            System.out.print("Opção: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    System.out.print("\nQual valor deseja reabastecer: ");
                    aux = bomb.abastecerPorValor(scan.nextFloat());
                    if(aux == -1){
                        System.out.println("Não há combustível suficiente!");
                    }
                    else{
                        System.out.printf("Total de litros: %.2fL\n", aux);
                    }
                    break;
                case 2:
                    System.out.print("\nQuantos litros deseja reabastecer: ");
                    aux = bomb.abastecerPorLitros(scan.nextFloat());
                    if(aux == -1){
                        System.out.println("Não há combustível suficiente!");
                    }
                    else{
                        System.out.printf("Valor total: R$ %.2f\n", aux);
                    }
                    break; 
                case 3:
                    System.out.print("\nInsira o novo preço: R$ ");
                    bomb.alterarPreco(scan.nextFloat());
                    System.out.println("Valor alterado com sucesso!");
                    break;
                case 4:
                    System.out.print("\nQuantidade de litros a ser reabastecida: ");
                    bomb.reabastecerTanque(scan.nextInt());
                    System.out.println("Tanque reabastecido com sucesso!");
                    break;
            }
            System.out.println("");
        }while(opc != 5);
    }
}