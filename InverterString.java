import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informe a string a ser invertida
        System.out.print("Informe uma string para ser invertida: ");
        String input = scanner.nextLine();

        // Inverter a string
        String inverted = inverterString(input);

        // Exibir a string invertida
        System.out.println("String invertida: " + inverted);
        scanner.close();
    }

    public static String inverterString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Trocar os caracteres da posição left com o da posição right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Mover para o próximo par de caracteres
            left++;
            right--;
        }

        // Construir a string invertida a partir do array de caracteres
        return new String(chars);
    }
    
}
