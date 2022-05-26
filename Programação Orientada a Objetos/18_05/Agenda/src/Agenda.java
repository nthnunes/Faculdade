import java.util.ArrayList;

public class Agenda {
    ArrayList <Contato> listaContatos;
    public Agenda(){
        this.listaContatos=new <Contato>ArrayList();
    }
    public void incluiContato(String nome, String fone, String data){
        Contato c=new Contato(nome, fone, data);
        this.listaContatos.add(c);
    }
    public void incluiContato(Contato c){
        this.listaContatos.add(c);
    }
    public boolean atualizaContato(String nome, String fone){
        for( int i=0; i<this.listaContatos.size(); i++){
            Contato c=this.listaContatos.get(i);
            if(nome.equals(c.getNome())){
                c.setFone(fone);
                return true;
            }
        }
        return false;
    }
    public boolean excluiContato(String nome){
        for( int i=0; i<this.listaContatos.size(); i++){
            Contato c=this.listaContatos.get(i);
            if(nome.equals(c.getNome())){
                this.listaContatos.remove(i);
                return true;
            }
        }
        return false;
    }
    public Contato consultaContato(String nome){
        for(int i=0; i<this.listaContatos.size(); i++){
            Contato c=this.listaContatos.get(i);
            if(nome.equals(c.getNome())){
                return c;
            }
        }
        return null;
    }
}
