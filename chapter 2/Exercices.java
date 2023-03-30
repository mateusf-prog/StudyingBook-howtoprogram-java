// Exercícios do capítulo
// Mateus 09/02/2023
import java.util.Scanner;   // programa utiliza a classe Scanner

public class Exercices    // declara a classe
{
    // metodo main inicia a execução do aplivcativo java
    public static void main(String[] args)
    {
        // cria um scanner para capturar a entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);   

        int c;
        int thisIsAVariable;
        int q76354;
        int number;
        
        System.out.print("Digite um valor: ");
        c = input.nextInt();    // le um valor digitado e armazena

        System.out.print("Digite o segundo valor: ");
        thisIsAVariable = input.nextInt();  // le o segundo valor digitado e armazena

        System.out.print("Digte o terceiro valor: ");
        q76354 = input.nextInt();   // le o terceiro valor digitado e armazena

        System.out.print("Digite o quarto valor: ");
        number = input.nextInt();   // le o quarto valor digitado e armazena
        
        // imprime duas saidas com formatos diferentes
        System.out.println("This is a Java Program!");
        System.out.printf("%s%n%s%n" , "This is a", "Java Program!"); 

        if (number != 7)    // testando uma condição
            System.out.print("A variável Number, não é igual a 7");
        input.close();
    }
}
