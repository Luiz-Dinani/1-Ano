package br.com.sptech.primeiraapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FrasesController {

    @GetMapping("/boa-tarde")
    public String getFrase(){
        return("Boa tarde!");
    }

    @GetMapping("/boa-noite")
    public String getFrase2(){
        return("Boa noite!");
    }

    @GetMapping("/saudacao/{nome}")
    public String getNome(@PathVariable String nome){
        return ("Olá: " + nome);
    }

    @GetMapping("/somar/{num1}/{num2}")
    public String getSoma(@PathVariable Integer num1, @PathVariable Integer num2){
        return ("O Resultado é: " + (num1+num2));
    }
}
