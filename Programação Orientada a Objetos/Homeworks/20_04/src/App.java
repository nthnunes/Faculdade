public class App {
    public static void main(String[] args) throws Exception {
        Departamento depto1 = new Departamento(1, "Secretaria", "SEC");
        Departamento depto2 = new Departamento(2, "Tecnologia da Informação", "TI");
        Funcionario funcio1 = new Funcionario(2000, "Júlia Batista", 1748.10f);
        Funcionario funcio2 = new Funcionario(1000, "Roberto Peres", 3500.56f);

        funcio1.setDepto(depto1);
        funcio2.setDepto(depto2);

        System.out.println("Funcionário: " + funcio1.getNome());
        System.out.println("Departamento: " + funcio1.getDepto().getNome());

        System.out.println("\nFuncionário: " + funcio2.getNome());
        System.out.println("Departamento: " + funcio2.getDepto().getNome());

        System.out.println("");
        if(funcio1.getSalario() > funcio2.getSalario()){
            System.out.println("Maior Salário: " + funcio1.getSalario() + " - " + funcio1.getNome());
        }
        else{
            System.out.println("Maior Salário: " + funcio2.getSalario() + " - " + funcio2.getNome());
        }
    }
}