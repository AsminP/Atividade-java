import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Exibe a mensagem inicial solicitada
        System.out.println("Hello, World!");
        System.out.println("-----------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Exibe o menu de opções
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        
        System.out.println("-----------------------------------");
        
        // Processa a escolha do usuário
        if (opcao == 1) {
            double resultadoSoma = numero1 + numero2;
            System.out.println("Resultado da Soma: " + resultadoSoma);
        } else if (opcao == 2) {
            double resultadoSubtracao = numero1 - numero2;
            System.out.println("Resultado da Subtração: " + resultadoSubtracao);
        } else {
            System.out.println("Opção inválida! Rode o programa novamente.");
        }
        
        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}