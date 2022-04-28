public class Nota {
    private float p1, p2;

    public void setP1(float nota) {
        this.p1 = nota;
    }

    public void setP2(float nota) {
        this.p2 = nota;
    }

    public float getMedia(){
        return (this.p1 + this.p2) / 2;
    }

    public String getSituacao(){
        float media = getMedia();

        if(media >= 7){
            return "Aprovado";
        }
        else if(media >= 4 && media < 7){
            return "De exame";
        }
        return "Reprovado";
    }
}