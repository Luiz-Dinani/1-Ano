package br.com.bandtec.projeto.banco;

import org.apache.commons.dbcp2.BasicDataSource;

/*
 * @author Aluno
 */
public class ConfiguracaoBanco {

    private BasicDataSource bancoDeDados;

    public ConfiguracaoBanco() { //Para conectar com qqlr banco é só trocar esses itens
        this.bancoDeDados = new BasicDataSource();
        bancoDeDados​.setDriverClassName("org.h2.Driver");
        bancoDeDados​.setUrl("jdbc:h2:file:./meu_banco");
        bancoDeDados​.setUsername("sa");
        bancoDeDados​.setPassword("");
    }

    public BasicDataSource getBancoDeDados() {
        return bancoDeDados;
    }        
}
