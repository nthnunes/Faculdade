public class Conta {
    private int numero;
    private String tipo;
    private float saldo;

    public Conta(int numero, String tipo, float saldo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void Depositar(float valor){
        if(valor <= 0){
            System.out.println("O valor inserido é inválido.");
        }
        else{
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso!");
        }
    }

    public boolean Sacar(float valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        System.out.println("Valor insuficiente para saque.");
        return false;
    }

    //A fazer
    public boolean Transferir(float valor, Conta destino){
        return true;
    }

    public int getNumero() {
        return this.numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
