// Programa de adição que insere dois números, então exibe a soma deles.
// Mateus 07/03/2023
import java.util.Scanner;   // programa utiliza a classe Scanner

public class Addition
{
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1;    // primeiro numero a somar
        int number2;    // segundo numero a somar
        int sum;    // soma de number1 e number2

        System.out.print("Enter first integer: ");    // prompt
        number1  = input.nextInt();   // lê o primero numero fornecido

        System.out.print("Enter second integer: ");    // prompt
        number2 = input.nextInt();  // lê o segundo numero fornecido

        sum = number1 + number2;    // soma os numeros e depois armazena em sum

        System.out.printf("Sum is %d%n", sum);  // exibe a soma
        input.close();
    }   // fim do método main
}   // fim da classe Addition