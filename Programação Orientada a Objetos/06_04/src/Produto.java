public class Produto {
    private String descricao;
    private float preco;
    private int qntd;
    private Fabricante fabric;

    public Produto(String descricao, float preco, int qntd){
        this.descricao = descricao;
        this.preco = preco;
        this.qntd = qntd;
    }

    public void setFabrica(Fabricante fabric){
        this.fabric = fabric;
    }

    public void repor(int qntd){
        this.qntd += qntd;
        System.out.println("A reposição do produto foi bem sucedida!");
    }

    public boolean vender(int qntd){
        if(this.qntd < qntd){
            return false;
        }
        this.qntd -= qntd;
        return true;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getQntd(){
        return this.qntd;
    }

    public Fabricante getFabricante(){
        return fabric;
    }
}