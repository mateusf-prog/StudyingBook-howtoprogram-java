// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade
// Mateus 09/03/2023
import java.util.Scanner;   //programa utiliza a classe Scanner

public class comparison    // declaração da classe
{
    // metodo main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // cria Scanner para capturar a entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);
        
        int number1;    // primeiro numero a comparar
        int number2;    // segundo numero a comparar

        System.out.print("Enter first integer: ");  // prompt
        number1 = input.nextInt();  // lê o primeiro numero fornecido 

        System.out.print("Enter a second integer: "); // prompt
        number2 = input.nextInt();  // lê o segundo numero fornecido

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
           System.out.printf("%d < %d%n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        input.close();
        
    }   // fim do metodo main
}   // fim da classe Comparison
