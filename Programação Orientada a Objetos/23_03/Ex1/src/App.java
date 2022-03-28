import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        Calculadora x = new Calculadora(n1, n2);
        System.out.println("Soma: " + x.Soma());
        System.out.println("Multiplicação: " + x.Mult());

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));

        x.Num(n1, n2);
        System.out.println("\nSoma: " + x.Soma());
        System.out.println("Multiplicação: " + x.Mult());
    }
}
