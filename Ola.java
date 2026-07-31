import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade e pode tirar a habilitação");
        } else if (idade >= 16) {
            System.out.println("A partir de 16 anos você pode fazer as aulas, mas não tirar a habilitação.");
        } else {
            System.out.println("Você é menor de idade. Portanto, não pode tirar habilitação agora.");
        }
    }
}