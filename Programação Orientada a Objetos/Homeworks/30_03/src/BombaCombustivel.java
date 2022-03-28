public class BombaCombustivel {
    private int nroBomba, tipoCombustivel;
    private float litrosCombustivel, preco;

    public BombaCombustivel(int nroBomba, int tipoCombustivel, float litrosCombustivel, float preco){
        this.nroBomba = nroBomba;
        this.tipoCombustivel = tipoCombustivel;
        this.litrosCombustivel = litrosCombustivel;
        this.preco = preco;
    }

    public float abastecerPorValor(float valor){
        valor /= this.preco;

        if((this.litrosCombustivel - valor) < 0){
            return -1;
        }
        else{
            this.litrosCombustivel -= valor;
            return valor;
        }
    }

    public float abastecerPorLitros(float qntLitros){
        if((this.litrosCombustivel - qntLitros) < 0){
            return -1;
        }
        else{
            this.litrosCombustivel -= qntLitros;
            qntLitros *= this.preco;

            return qntLitros;
        }
    }

    public void reabastecerTanque(int qntLitros){
        this.litrosCombustivel += qntLitros;
    }

    public void alterarPreco(float preco){
        this.preco = preco;
    }
}