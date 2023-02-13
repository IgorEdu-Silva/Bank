package Bank;

import java.util.Random;
import java.util.Scanner;

public class Withdraw {
    Dice dice = new Dice();
    public void withdrawB() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("O valor existente na sua conta atualmente é: " + Client.cash + ".\n");

        if (Client.cash > 0) {
            System.out.println("Quanto deseja retirar? ");
            dice.storage = sc.nextInt();

            Client.cash = Client.cash - dice.storage;

            System.out.println("O valor restante na conta é: " + Client.cash);
            System.out.println("ID de transação " + rd.nextInt(100000 + 1));
            System.out.println("Muito obrigado pela preferência\n");

        }

        if (Client.cash == 0) {
            System.out.println("Valor não disponível");
            System.out.println("Tente novamente após ser depositado alguma quantia\n");
        }

        Choices Choices = new Choices();
        Choices.choices();
    }
}
