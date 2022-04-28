public class Funcionario {
    int codigo;
    String nome;
    float salario;
    Departamento depto;

    public Funcionario(int codigo, String nome, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.salario =  salario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    public Departamento getDepto() {
        return this.depto;
    }
}