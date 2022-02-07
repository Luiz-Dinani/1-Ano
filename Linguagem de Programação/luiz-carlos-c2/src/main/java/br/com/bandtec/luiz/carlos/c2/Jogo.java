package br.com.bandtec.luiz.carlos.c2;

/*
 * @author Luiz Carlos
 */
public class Jogo {
    private String nome;
    private String genero;
    private Integer estoque;
    private Double preco;

    public Jogo(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.estoque = 0;
        this.preco = 0.00;
    }        

    public Jogo() {
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
    
    public Integer getEstoque() {
        return estoque;
    }    
  
    public Double getPreco() {
        return preco;
    }    

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    @Override
    public String toString() {
        return String.format("\n\tNome: %s \n\tGênero: %s \n\tPreço: R$ %.2f \n\tEstoque: %d",
                nome, genero, preco, estoque);
    }
    
    
}
