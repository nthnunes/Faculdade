public class Calculadora {
    private float n1, n2;

    public Calculadora(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public Calculadora(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public float Soma(){
        return this.n1 + this.n2;
    }

    public float Mult(){
        return this.n1 * this.n2;
    }

    public void Num(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void Num(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
    }
}
