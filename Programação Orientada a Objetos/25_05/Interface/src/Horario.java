public class Horario implements MeuHorario{
    private int hora, minuto, segundo;

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.hora;
    }

    public int getSegundo(){
        return this.hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public void setSegundo(int segundo){
        this.segundo = segundo;
    }

    public String convert(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
}