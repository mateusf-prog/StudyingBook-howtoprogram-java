// Exercício 2.16 - cap. 2
// Mateus 18/03/2023

/* Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha 
dele esses números e exiba o número maior seguido pelas palavras “is larger". 
Se os números forem iguais, imprima a mensagem “These numbers are equal".  */

import java.util.Scanner; 

public class Exercice2_16
{
    public static void main(String[] Args) 
    {
        // Cria um objeto scanner para capturar a entrada de dados via teclado
        Scanner input = new Scanner(System.in);
        
        // Declarando variáveis
        int n1, n2;

        // Entrada de dados
        System.out.println("Informe dois números inteiros");
        System.out.print("Núumero 1: ");
        n1 = input.nextInt();
        System.out.print("Número 2: ");
        n2 = input.nextInt();

        // Processamento e saída de dados
        if (n1 > n2)
            System.out.println("Número 1 é maior que número 2");
        else if (n1 == n2)
            System.out.println("Número 1 é igual a número 2");
        else if (n1 < n2)
            System.out.println("Número 1 é menor que número 2");
        
        // Desalocando recursos
        input.close();
    }
}