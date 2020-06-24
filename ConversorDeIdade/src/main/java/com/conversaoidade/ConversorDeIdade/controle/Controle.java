package com.conversaoidade.ConversorDeIdade.controle;
import com.conversaoidade.ConversorDeIdade.conversorDeIdade.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    @GetMapping("/usuario")
    public String mensagem() {
        Conversor c = new Conversor();
        c.setAno(20);
        return c.mostrarResultados();
    }
}