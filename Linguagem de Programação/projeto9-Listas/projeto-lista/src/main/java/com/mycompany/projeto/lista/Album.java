package com.mycompany.projeto.lista;

import java.util.List;

/*
 * @author aluno
 */
public class Album {

    private String nome;
    private List<Musica> listaMusicas;

    public Album(String nome, List musicas) {
        this.nome = nome;
        this.listaMusicas = musicas;
    }
    
    public void cadastrarMusica(Musica musica){
        this.listaMusicas.add(musica);
    }
    
    public void atualizarNomeMusica(String nomeAntigo, String novoNome){
        for (Musica musica : listaMusicas) {
            if(musica.getNome().equalsIgnoreCase(nomeAntigo)){
                musica.setNome(novoNome);
            }
        }
    }
}
