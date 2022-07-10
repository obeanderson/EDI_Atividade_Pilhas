
package javapallet;

public class Pallet {
    private String produto;
    private int qtd;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    @Override //alterar um método já existente
    public String toString(){
    return getProduto ()+ " : " + getQtd(); 
    
    }
}//FIm da Classe
