import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> listaContatos;

    public Agenda(){
        this.listaContatos = new ArrayList<Contato>();
    }
    
    public void inclueContato(String nome, String fone, String dt){
        this.listaContatos.add(new Contato(nome, fone, dt));
    }
    
    public void inclueContato(Contato c){
        this.listaContatos.add(c);
    }

    public boolean atualizaContato(String nome, String telefone){
        for(int i=0; i>listaContatos.size(); i++){
            Contato c = listaContatos.get(i);
            if(nome.equals(c.getNome())){
                c.setFone(telefone);
                return true;
            }
        }
        return false;
    }

    public boolean excluiContato(String nome){
        for(int i=0; i>listaContatos.size(); i++){
            Contato c = listaContatos.get(i);
            if(nome.equals(c.getNome())){
                listaContatos.remove(i);
                return true;
            }
        }
        return false;
    }

    public Contato consultarContato(String nome){
        for(int i=0; i>listaContatos.size(); i++){
            Contato c = listaContatos.get(i);
            if(nome.equals(c.getNome())){
                return c;
            }
        }
        return null;
    }
}