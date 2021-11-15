package com.bandtec.exercicios.relacionamento;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {

    /*
     * Deve ser informado no momento da criação do objeto
     */
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    /*
     * Deve retornar a quantidade total de produtos;
     */
    public Integer getQuantidade() {
        return produtos.size();
    }

    /*
     * Deve adicionar um produto, não deve permitir duplicidade (nome), se for o
     * caso, não faça nada;
     */
    public void adicionar(Produto produto) {
        
        if (produto != null) {
            if (!existsPorNome(produto.getNome())) {
                produtos.add(produto);
            }
            /* Expanda para ver os códigos que deram errado
            // if (produtos.size() == 0) {
            //     produtos.add(produto);
            // } else {
            //     for (int i = 0; i < produtos.size(); i++) {
            //         String produtoI = produtos.get(i).getNome();
            //         //for (int j = i + 1; j < produtos.size(); j++) {
            //           //  String produtoJ = produtos.get(j).getNome();
            //             if (produtoI == produto.getNome()) {
            //                 // Não faz nada
            //             } else {
            //                 produtos.add(produto);
            //             }
            //         }
            //     }
              
            //     for (Produto produtoAtual : produtos) {
            //     if (produtoAtual.getNome() == produto.getNome()) {
            //         // Não faz nada
            //     } else {
            //         produtos.add(produto);
            //     }
            // }    
            */
        }
    }

    /*
     * Deve verificar se existe um objeto com o nome informado, caso nao tenha deve
     * retornar false;
     */
    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Deve retornar a quantidade existente a partir da categoria informada;
     */
    public Integer getQuantidadePorCategoria(String categoria) {
        Integer qtdProdutos = 0;
        if (categoria != null) {
            for (Produto produto : produtos) {
                System.out.println(produto.getCategoria());
                if (produto.getCategoria().toLowerCase().equals(categoria.toLowerCase())) {
                    qtdProdutos++;
                }
            }
        }
        return qtdProdutos;
    }

    /*
     * Deve limpar a lista(remover todos os elementos);
     */
    public void limpar() {
        produtos.clear();
    }

    /*
     * Deve remover um produto, caso nao exista, não faça nada.
     */
    public void removerPorNome(String nome) {
//Se colocar o produtos.remove(produto) dentro do for, vai dar um erro
//dizendo que a lista tá sendo usada pra duas coisas ao mesmo tempo,
//por isso precisa do Objeto produtoASerRemovido e do segundo if.
//(Só depois que a verificação do for acabar, ele exclui os produto, casa haja algum)
        Produto produtoASerRemovido = null;  
        if (nome != null) {
            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    produtoASerRemovido=produto;
                }
            }
            if (produtoASerRemovido != null) {
                produtos.remove(produtoASerRemovido);
            }
        }
    }

    /*
     * Deve recuperar um produto, caso nao exista, retorne null.
     */
    public Produto getPorNome(String nome) {
        System.out.println("TESTANDO LINHA 98");
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    /*
     * Deve retornar o valor total do produtos contidos no carrinho, caso lista
     * esteja vazia, retorne 0;
     */
    public Double getValorTotal() {
        Double totalValorCarrinho = 0.00;
        for (Produto produto : produtos) {
            totalValorCarrinho += produto.getPreco();
        }
        return totalValorCarrinho;

    }

}