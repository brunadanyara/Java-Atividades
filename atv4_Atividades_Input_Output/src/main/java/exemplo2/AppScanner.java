package exemplo2;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe sua Indade: ");
        int idade = scanner.nextInt();

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);

    }
}
