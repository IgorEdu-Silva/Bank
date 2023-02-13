package Bank;

import java.util.Scanner;

public class Choices {
    public void choices(){
        Scanner sc = new Scanner(System.in);

        CreateAcc createAcc = new CreateAcc();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        Dice dice = new Dice();
        Options option = new Options();


        System.out.println("1 - Acessar minha conta");
        System.out.println("2 - Fazer um depósito");
        System.out.println("3 - Retirar uma quantia");
        System.out.println("4 - Sair\n");
        option.option = sc.next();
        dice.converter = Integer.parseInt(option.option);


        do {
            if (dice.converter == 1) {
                createAcc.createB();
            }

            if (dice.converter == 2) {
                deposit.depositB();
            }

            if (dice.converter == 3) {
                withdraw.withdrawB();
            }
        } while (dice.converter != 4);
        System.out.println("Obrigado e volte sempre!");
        System.exit(0);
    }

}