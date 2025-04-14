public class Tabuada {

    public static void main(String[] args) {
        // Declarar variáveis
        int num = 5;
        int cont = 1;
        int result;
        
        // Laço "enquanto" (while) para imprimir a tabuada de 5
        while (cont <= 10) {
            result = num * cont;
            System.out.println("Resultado: " + num + " x " + cont + " = " + result);
            cont++; // Incrementar o contador
        }
    }
}
