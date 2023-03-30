// Exercício 2.17 - cap. 2
// Mateus 17/03/2023

/* Escreva um aplicativo que insira três inteiros digitados pelo usuário e 
exiba a soma, média, produto e os números menores e maiores.*/

import java.util.Scanner;

public class Exercice2_17
{
    public static void main(String[] args) 
    {
        // Método main inicia a execução do aplicativo Java
        Scanner input = new Scanner(System.in);

        // Declarando as variáveis
        int n1, n2, n3, soma, media, produto;

        // Entrada de dados
        System.out.println("Informe três números inteiros, um em cada linha:");
        System.out.print("Número 1: ");
        n1 = input.nextInt();
        System.out.print("Número 2: ");
        n2 = input.nextInt();
        System.out.print("Número 3: ");
        n3 = input.nextInt();

        // Processamento
        soma = n1 + n2 + n3;
        media = (n1 + n2 + n3) / 3;
        produto = n1 * n2 * n3;

        // Testes condicionais 
        if (n1 > n2)
            System.out.println("Número 1 é maior que número 2");
            else if (n1 < n2)
                System.out.println("Número 2 é maior que número 1");
            else
                System.out.println("Número 1 e 2 são iguais");
        if (n1 > n3)
            System.out.println("Número 1 é maior que número 3");
            else if (n1 < n3)
                System.out.println("Número 3 é maior que número 1");
            else
                System.out.println("Número 1 e 3 são iguais");
        if (n2 > n3)
            System.out.println("Número 2 é maior que número 3");
            else if (n2 < n3)
                System.out.println("Número 3 é maior que número 2");
            else
                System.out.println("Número 2 e 3 são iguais");
        System.out.printf("A soma dos tres números é %d%n", soma);
        System.out.printf("A média dos três números é %d%n", media);
        System.out.printf("O produto dos três números é %d%n", produto);

        // Desalocando recursos
        input.close(); 
    }
}
