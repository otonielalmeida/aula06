package visao;
import java.util.Scanner;
import modelo.Livro;
import modelo.Cliente;
public class Teste {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Scanner read = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.println("Digite  o nome do livro: (biologia ou animalia)");
        l1.setNome(read.nextLine());
        System.out.println(l1.liv());
        System.out.println("Digite seu codigo de inscricao:");
        l1.setCod(read.nextInt());
        System.out.println("Digite sua idade: ");
        c1.setIdade(read.nextInt());
        System.out.println(c1.liv());
        System.out.println("Digite seu genero: ");
        c1.setSexo(read.nextLine());
        System.out.println(l1.toString());
        System.out.println(c1.toString());
    }
}