// Exercício 2.14 - cap. 2
// Mateus 17/03/2023

/* Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes 
separados por um espaço. */
                          
public class Exercice2_14 
{
    public static void main(String[] args) 
    {
        // Usando println
        System.out.println("1 2 3 4");

        // Usando quatro instruções print
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");

        // Usando printf
        System.out.printf("%n%d %d %d %d", 1, 2, 3, 4);
    }

}
