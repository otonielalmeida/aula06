package com.conversaoidade.ConversorDeIdade.conversorDeIdade;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
public class Conversor {
@Getter @Setter
public int ano;


    int converterMeses(){return this.ano * 12;}
    int converterSemanas(){return this.ano * 52;}
    int converterDias(){return this.ano * 365;}
    public String mostrarResultados(){
        return "Ano: "+this.ano+
                "\nMeses: "+this.converterMeses()+
                "\nSemanas: "+this.converterSemanas()+
                "\nDias: "+this.converterDias();
    }
}
