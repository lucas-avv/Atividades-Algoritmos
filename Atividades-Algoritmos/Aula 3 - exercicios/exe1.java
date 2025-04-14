import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis
        String nome;
        double nota1, nota2, nota3, media;
        
        // Solicitar o nome do aluno
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        
        // Solicitar as notas das três provas
        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();
        
        // Calcular a média
        media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir o nome do aluno e a média
        System.out.println("Aluno: " + nome);
        System.out.println("A média da sua nota é: " + media);
        
        // Fechar o scanner
        scanner.close();
    }
}
