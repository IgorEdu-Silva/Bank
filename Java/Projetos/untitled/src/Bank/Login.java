package Bank;

import java.util.Random;
import java.util.Scanner;

public class Login {
    Dice dice = new Dice();
    Options option = new Options();
    public void loginB(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco. O que deseja?\n");

        while (!option.option.equals(option.option1) && !option.option.equals(option.option2)) {
            System.out.println("1 - Desejo abrir uma conta");
            System.out.println("2 - Onde é o banheiro?\n");
            option.option = String.valueOf(Integer.parseInt(sc.next()));
        }

        if (option.option.equals(option.option1)) {
            System.out.println("Muito bem, para que possamos prosseguir, poderia dizer-me seu nome?");
            Client.name = sc.next();

            System.out.println("Agora crie uma senha para darmos mais um passo");
            Client.password = sc.next();


            System.out.println("Qual tipo de conta gostaria de abrir? Corrente ou Poupança?");
            System.out.println("1 para Corrente ou 2 para Poupança");
            dice.accCliente = sc.next();

            dice.accClienteCov = Integer.parseInt(dice.accCliente);
            Client.id = rd.nextInt(100);

            while (dice.accClienteCov != 1 && dice.accClienteCov != 2) {
                System.out.println("Valor inválido\n");
                System.out.println("Qual tipo de conta gostaria de abrir? Corrente ou Poupança?");
                System.out.println("1 para Corrente ou 2 para Poupança");
                dice.accClienteCov = sc.nextInt();
            }

            if (dice.accClienteCov == 1){
                Client.accountType = AccountType.CORRENTE;
                System.out.println("Seja bem vindo ao Banco, " + Client.name + " sua conta " +
                        Client.accountType + " foi aberta com sucesso.\n");
            }

            if (dice.accClienteCov == 2) {
                Client.accountType = AccountType.POUPANCA;
                System.out.println("Seja bem vindo ao Banco, " + Client.name + " sua conta " +
                        Client.accountType + " foi aberta com sucesso.\n");
            }
        }
        if (option.option.equals(option.option2)) {
            System.out.println("Segunda porta a esquerda após o corredor");
            System.out.println("Tenha um bom dia");

            System.exit(0);
        }

        Choices Choices = new Choices();
        Choices.choices();
    }
}
