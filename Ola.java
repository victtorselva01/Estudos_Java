import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Quantos anos você tem?");
        int idade = leitor.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        }
    }
    
