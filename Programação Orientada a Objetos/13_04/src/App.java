public class App {
    public static void main(String[] args) throws Exception {
        Veiculo car1 = new Veiculo("AAABBB", "Toyota", "Hilux", "Prata");
        Veiculo car2 = new Veiculo("CCCDDD", "Fiat", "Uno", "Vermelho");
        Motorista motorista1 = new Motorista("123456", "AB", "Ynuan");

        motorista1.setCarro(car1);

        System.out.println("Informações motorista:");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("CNH: " + motorista1.getCnh());
        System.out.println("Modelo: " + motorista1.getCarro().getModelo());
        System.out.println("Placa: " + motorista1.getCarro().getPlaca());
    }
}