// Exercício 2.15 - cap. 2
// Mateus 17/03/2023

/* Escreva um aplicativo que solicite ao usuário inserir
dois inteiros, obtenha dele esses números e imprima
sua soma, produto, diferença e quociente (divisão). */

import java.util.Scanner;

public class Exercice2_15
{
    // Método main inicia a execução do aplicativo Java
    public static void main(String[] args) 
    {
        // Cria um objeto scanner para captura da entrada de dados via teclado
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis
        int num1, num2, soma, produto ,diferenca;
        double quociente;

        // Entrada de dados
        System.out.println("Digite dois valores inteiros, um em cada linha: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        // Processamento
        soma = num1 + num2;
        produto = num1 * num2;;
        diferenca = num1 - num2;
        quociente = num1 / num2;

        // Saída de dados
        System.out.printf("A soma dos dois números é %d%n", soma);
        System.out.printf("O produto é %d%n", produto);
        System.out.printf("A diferença é %d%n", diferenca);
        System.out.printf("O quociente é %.1f%n", quociente);

        // Desalocando recursos
        input.close();
    }

}