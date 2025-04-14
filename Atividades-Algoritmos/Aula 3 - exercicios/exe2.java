import java.util.Scanner;

public class InverterVariavel {

    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis
        int A, B, IvertidaA, IvertidaB;
        
        // Solicitar os valores para A e B
        System.out.print("Digite um número inteiro para A: ");
        A = scanner.nextInt();
        
        System.out.print("Digite um número inteiro para B: ");
        B = scanner.nextInt();
        
        // Realizar as trocas
        IvertidaA = B;
        IvertidaB = A;
        
        // Exibir os valores invertidos
        System.out.println("O número invertido de A: " + IvertidaA);
        System.out.println("O número invertido de B: " + IvertidaB);
        
        // Fechar o scanner
        scanner.close();
    }
}
