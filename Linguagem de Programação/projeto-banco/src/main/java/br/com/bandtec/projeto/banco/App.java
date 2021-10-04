package br.com.bandtec.projeto.banco;

import com.github.javafaker.Faker;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
/*
 * @author Aluno
 */
public class App {
    public static void main(String[] args) {
        ConfiguracaoBanco configBD = new ConfiguracaoBanco();
        Faker faker = new Faker();
        Random random = new Random();
        
        JdbcTemplate assistente = new JdbcTemplate(configBD.getBancoDeDados());
    
        assistente.update("insert into aluno values(?,?,?)", null, faker.name().fullName(), 70);
//        System.out.println(assistente.queryForList("select * from aluno;"));        

        List<Aluno> alunos = assistente.query("Select * from aluno", new BeanPropertyRowMapper<>(Aluno.class));
        System.out.println("Alunos encontrados...");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }  
}