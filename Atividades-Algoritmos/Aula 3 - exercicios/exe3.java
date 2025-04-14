import java.util.Scanner;

public class SalarioVendedor {

    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis
        String nome;
        double salario, vendas, salarioFinal;
        
        // Solicitar o nome do vendedor
        System.out.print("Digite o nome do funcionário: ");
        nome = scanner.nextLine();
        
        // Solicitar o salário fixo do vendedor
        System.out.print("Digite o valor do salário fixo: ");
        salario = scanner.nextDouble();
        
        // Solicitar o valor das vendas efetuadas
        System.out.print("Digite o valor das vendas: ");
        vendas = scanner.nextDouble();
        
        // Calcular o salário final (salário fixo + 15% de comissão sobre as vendas)
        salarioFinal = (vendas * 0.15) + salario;
        
        // Exibir o nome do vendedor e o salário final
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário final é: " + salarioFinal);
        
        // Fechar o scanner
        scanner.close();
    }
}
