// Estudo de classes - cap. 3
// Mateus 22/03/2023
// Cria e manipula um objeto Account
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args) 
    {
        // cria um objeto Scanner
        Scanner input = new Scanner(System.in);

        // cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solicita e lê o nome
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // lê uma linha de texto
        myAccount.setName(theName); // insere theName em myAccount
        System.out.println(); // gera saida de uma linha em branco
        
        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is: %n%s%n",
            myAccount.getName());
    }
}  // fim da classe AccountTest
