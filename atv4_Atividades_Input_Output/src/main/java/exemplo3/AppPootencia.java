package exemplo3;

import java.util.Scanner;

public class AppPootencia {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 1 número inteiro: ");
        x = scanner.nextInt();
        System.out.println("Informe 2 número inteiro: ");
        y = scanner.nextInt();

        double potencia = Math.pow(x, y);
        double raiz = Math.pow(x, (1 / y));
        double sqrt = Math.sqrt(x);
        System.out.println("A potência é: " + potencia);
        System.out.println("A raiz é: "+ raiz);
        System.out.println("A raiz quadrada é " + sqrt);

    }
}
