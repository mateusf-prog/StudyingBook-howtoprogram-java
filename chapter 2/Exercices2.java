// Exercícios do capitulo
// Mateus 10/03/2023
// Este programa calculará o produto de três inteiros
import java.util.Scanner;

public class Exercices2
{
    // metodo main inicia a execução da aplicaçao Java
    public static void main(String[] args)
    {
        // Cria um Scanner para capturar a entrada a partir do prompt
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int resultado;
        
        // imprime uma mensagem de início
        System.out.println("-- Cálculo do produto de três inteiros! --");

        // recebendo as entradas
        System.out.print("Digite o primeiro valor: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        number2 = input.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        number3 = input.nextInt();

        // fazendo o calculo e armazenando em uma variável
        resultado = number1 * number2 * number3;

        // resultado
        System.out.printf("O resultado é %s", resultado);
        
        // libera os recursos do sistema usados pelo Scanner
        input.close();  
    }
}