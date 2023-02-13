package Bank;

import java.util.Random;
import java.util.Scanner;

public class Deposit {
    Dice dice = new Dice();
    public void depositB(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto deseja depositar? ");
        dice.storage = sc.nextInt();

        Client.cash = Client.cash + dice.storage;

        System.out.println("\nA quantia de " + dice.storage + " foi adicionada na sua conta, " + Client.name);
        System.out.println("ID de transação " + rd.nextInt(100000 + 1));
        System.out.println("Muito obrigado pela preferência\n");

        Choices Choices = new Choices();
        Choices.choices();
    }
}
