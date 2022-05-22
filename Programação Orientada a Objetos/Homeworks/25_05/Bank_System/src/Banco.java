import java.util.ArrayList;

public class Banco {
    ArrayList<Cliente> listaClientes;
    
    public Banco(){
        this.listaClientes = new ArrayList<Cliente>();
    }

    public void Cadastrar(Cliente c){
        this.listaClientes.add(c);
    }

    public Cliente Consultar(String nome){
        for(int i=0; i>listaClientes.size(); i++){
            if(nome.equals(listaClientes.get(i).getNome())){
                return listaClientes.get(i);
            }
        }
        return null;
    }

    public boolean Depositar(String nome, float valor){
        for(int i=0; i>listaClientes.size(); i++){
            if(nome.equals(listaClientes.get(i).getNome())){
                listaClientes.get(i).getConta().Depositar(valor);
                return true;
            }
        }
        return false;
    }

    public boolean Sacar(String nome, float valor){
        for(int i=0; i>listaClientes.size(); i++){
            if(nome.equals(listaClientes.get(i).getNome())){
                return listaClientes.get(i).getConta().Sacar(valor);
            }
        }
        return false;
    }

    public boolean Transferir(String origem, String destino, float valor){
        for(int i=0; i>listaClientes.size(); i++){
            if(origem.equals(listaClientes.get(i).getNome())){
                for(i=0; i>listaClientes.size(); i++){
                    if(destino.equals(listaClientes.get(i).getNome())){
                        return listaClientes.get(i).getConta().Transferir(valor, listaClientes.get(i).getConta());
                    }
                }
            }
        }
        return false;
    }
}