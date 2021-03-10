package modelo;

public class Cliente {
    public Cliente() {
    }
    public int idade;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String liv(){
        if(getIdade() < 17){
            return "Venda apenas para maiores de idade";
        }else {
            return "Apto para compra";
        }}

    public String toString(){
        return "Idade: "+getIdade()+
                "\nGenero : "+getSexo();
    }
}
