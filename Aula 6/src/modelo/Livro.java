package modelo;

public class Livro {
    public String nome;
    public double preco;
    private int cod;
    public Livro() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String liv(){
        if(getNome() == "animalia"){
        return "Valor: 150,00";
        }else{
            return "Valor: 250,00";
        }
    }

    public String toString(){
        return "Nome do livro"+getNome()+
                "\nCodigo de inscircao: "+getCod();
    }
}
