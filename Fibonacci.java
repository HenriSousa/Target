import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informe o número para verificar se ele pertence à sequência de Fibonacci
        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c;

        boolean pertence = false;

        System.out.print("Sequência de Fibonacci até o número informado: ");
        while (a <= numero) {
            System.out.print(a + " ");
            if (a == numero) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (pertence) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
