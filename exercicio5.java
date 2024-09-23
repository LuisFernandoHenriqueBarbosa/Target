import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        String entrada = "", resultado = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para ser invertida: ");
        entrada = scanner.nextLine();
        for (int i = entrada.length() - 1; i >= 0; i--) {
            resultado += entrada.charAt(i);
        }
        System.out.println("String invertida: " + resultado);
        scanner.close();
    }
}
